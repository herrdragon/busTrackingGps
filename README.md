# Bus Tracking GPS

Included original Ada Fruit GPS program, original GPRS HTTP POST program (from Pachube), and both programs combined and modified
which is the one that is actually loaded to the Arduino.
Just copy the combined program to the Arduino SDK and uploaded to the Arduino.
For GPS model and wiring visit https://learn.adafruit.com/adafruit-ultimate-gps/arduino-wiring.
The GPRS Shield is from SeeedStudio.

### See the [Installation wiki](https://github.com/herrdragon/busTrackingGps/wiki/Installation) page for more details

#### Status

Beta (Testing in progress)

#### Screenshots

![GPS Tracker 1](https://github.com/qtrandev/busTrackingGps/blob/master/images/GPS-Tracker1.jpg)  ![GPS Tracker 2](https://github.com/qtrandev/busTrackingGps/blob/master/images/GPS-Tracker2.jpg) 

#### Press

None

## Why

We need a cheap open-source solution to track transit buses.

## Who

Code for Miami

## How
#### Hardware

Arduino board ([Amazon link](http://www.amazon.com/gp/product/B008GRTSV6))  
GPRS shield ([Amazon link](http://www.amazon.com/gp/product/B00BOZ8K6Q))  
GPS board ([Amazon link](http://www.amazon.com/gp/product/B00GLW4016), [Adafruit link](http://www.adafruit.com/products/746))  
Case for Arduino board ([Amazon link](http://www.amazon.com/gp/product/B003ZKJNVY/))  
SIM card with data plan ([T-Mobile link](http://explore.t-mobile.com/unlimited-prepaid-plans))  

### Costs

Arduino board $21  
GPRS shield $29  
GPS board $40  
Case for Arduino board $10  
SIM card with data plan $40/month  

#### Software

[Miami Transit API](https://github.com/CyberStrike/miami-transit-api)
[LeafletTransit](https://github.com/Code-for-Miami/LeafletTransit)

#### Deploy

See the wiki for [Installation](../../wiki/Installation) and assembly instructions.

#### Testing

1) Connect GPS Tracker to USB power supply in the vehicle.  
2) Place tracker in a location open to the sky for a good GPS signal.  
3) Wait about 5 minutes for the signal to be obtained.  
4) Open the Code for Miam LeafletTransit web app to view the location of the GPS Tracker.  

## Contribute

Contact Code for MIA

## License
Code for America [LICENSE.md file](https://github.com/codeforamerica/ceviche-cms/blob/master/LICENCE.md).

## More Information

Wiki of discussion of Miami-Dade county's bus tracking system ([Wiki link](https://github.com/herrdragon/busTrackingGps/wiki))  
