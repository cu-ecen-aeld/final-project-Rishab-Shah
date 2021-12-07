### BMAP Utility: <br> 
 * Motivation:<br>
To program an SD card with ``` foo.wic.bz2``` format BMAP tool is helpful.<br>
```foo -> core-image-base-raspberrypi3 ``` <br>
BMAP tool takes less arguments and easy to interpret.
 * Command format:<br>
Be sure to select, proper sd[x] (x is the relevant partition) partition before running following command.
Usually, sd[a] would be your windows partition when running the command from a virtual box.
```
sudo bmaptool copy path/to/image.wic.bz2 /dev/sd[b-z] 
```
 * Command usage example:<br>
In the root of your build repo execute the following command:
```
sudo bmaptool copy build/tmp/deploy/images/raspberrypi3/core-image-base-raspberrypi3.wic.bz2 /dev/sdb
```
 * Reference:<br>
http://manpages.ubuntu.com/manpages/trusty/man1/bmaptool.1.html


