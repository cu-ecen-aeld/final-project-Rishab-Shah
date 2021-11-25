#! /bin/sh

cp /usr/share/custom/wpa_supplicant.conf /etc/wpa_supplicant.conf

ifup wlan0
