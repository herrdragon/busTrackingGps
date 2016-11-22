// This file formats sample input from "bustracker.csv" into a more API friendly format (GTFS based)
// It uses Scala, a functional programming language that transforms immutable data (splits columns, maps rows, etc).

object GTFS_Formatter extends App {

  // This just closes the IO
  def using[A <: { def close(): Unit }, B](resource: A)(f: A => B): B =
    try {
      f(resource)
    } finally {
      import scala.language.reflectiveCalls
      resource.close()
    }

  // watch out for bad input. Ex.
  // "19","25",,"2015-03-30 20:03:20","0",NULL,NULL,NULL
  // "562","hello","there","2015-04-13 20:40:45","0",NULL,NULL,NULL

  var GTFS_positions = List[String]() // this holds all the GTFS positions
  using(io.Source.fromFile("bustracker.csv")) { source => {
    for (line <- source.getLines) {
      val row = line.split(",").toList
      System.err.println(row) // Ex. List("433281", "25.8106", "-80.3146", "2016-08-04 15:56:00", "1", "0.03", NULL)
      val latitudeStr = row(1)
      val longitudeStr = row(2)
      // filter out empty strings by length
      if(latitudeStr.length > 1 && longitudeStr.length > 1) {
        // filter out quotation marks
        val quote: Char = '\"'
        val latitudeStrNoQuotes = latitudeStr.filterNot( _ == quote )
        val longitudeStrNoQuotes = longitudeStr.filterNot( _ == quote )
        try {
          val latitude = latitudeStrNoQuotes.toDouble
          val longitude = longitudeStrNoQuotes.toDouble
          val newRow = "Position {\n latitude: " + latitude + ",\n longitude:" + longitude + "\n}"
          System.err.println(newRow + "\n")
          GTFS_positions = newRow :: GTFS_positions
          // catch bad input that is not number
        } catch {
          case e: java.lang.NumberFormatException =>
            println("Bad input: " + latitudeStr + " " + longitudeStr)
        }
      }
    }
  }}
}

/*
Sample Output:

List("433281", "25.8106", "-80.3146", "2016-08-04 15:56:00", "1", "0.03", NULL)
Position {
 latitude: 25.8106,
 longitude:-80.3146
}
*/
