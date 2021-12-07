#! /bin/sh
# Summary: Auto configuration of wifi
# Author: Rishab Shah
# Choosing a path which is architecture indepedent for felxibility.
# https://git.yoctoproject.org/poky/plain/meta/conf/bitbake.conf?h=blinky
# Please refer above link for architecture indedependent path definitions 
# export prefix = "/usr"
# Architecture independent paths
# export datadir = "${prefix}/share"

# Shutting down the wifi service
ifdown wlan0

# Copying files to relevant location from tem location
cp /usr/share/wifi_custom/wpa_supplicant.conf /etc/wpa_supplicant.conf

# Starting the wifi service at bootup
ifup wlan0
