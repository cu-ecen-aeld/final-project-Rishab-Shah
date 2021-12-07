### I2C module support for Raspberry-pi

 * Motivation: <br>
I2C module was a new component which was unexplored for the yocto as per wikipage.<br>
This would serve as a reusable component for projects which use I2C based sensor and help to dedicate time to develop user-space application for the same. <br>

 * Implementation: <br>
Please refer Pull Request:https://github.com/cu-ecen-aeld/yocto-assignments-base/pull/3 <br>
Following configurations are verified for Raspberry-pi 3b+
1. To enable I2C module, add ```ENABLE_I2C = 1``` to local.conf
2. To autoload I2C module, add ```KERNEL_MODULE_AUTOLOAD:rpi += i2c-dev i2c-bcm2708``` to local.conf <br>
```i2c-bcm2708``` will vary for hardware based upon the chip supported for the hardware device.
3. To add  i2c tools support add ```IMAGE_INSTALL_append = i2c-tools ``` in local.conf file.

 * Testing: <br>
After successful boot, following verifications would pass <br>

1. Run ```lsmod | grep i2c``` to verify if I2C module is loaded.
2. Run ```i2c-detect -y 1``` to verify that the I2C device connected to I2C bus is in good condition.

 * References: <br>
https://forums.raspberrypi.com/viewtopic.php?t=298693 <br>
https://raspberrypi.stackexchange.com/questions/47234/i2c-on-a-rpi-basic-image-created-with-yocto <br>
https://www.yoctoproject.org/pipermail/yocto/2016-January/027984.html <br>
