# See http://git.yoctoproject.org/cgit.cgi/poky/tree/meta/files/common-licenses
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# TODO: Set this  with the path to your assignments rep.  Use ssh protocol and see lecture notes
# about how to setup ssh-agent for passwordless access
#SRC_URI = "git://git@github.com/cu-ecen-aeld/final-project-DhruvHMehta.git;protocol=ssh;branch=master"
SRC_URI = "file://wpa_supplicant.conf"
#PV = "1.0+git${SRCPV}"
# TODO: set to reference a specific commit hash in your assignment repo
#SRCREV = "${AUTOREV}"

# This sets your staging directory based on WORKDIR, where WORKDIR is defined at 
# https://www.yoctoproject.org/docs/latest/ref-manual/ref-manual.html#var-WORKDIR
# We reference the "server" directory here to build from the "server" directory
# in your assignments repo
#S = "${WORKDIR}/git"
#B = "${S}/wifi_config"
# TODO: Add the aesdsocket application and any other files you need to install
# See http://git.yoctoproject.org/cgit.cgi/poky/plain/meta/conf/bitbake.conf?h=warrior for yocto path prefixes



#https://git.yoctoproject.org/poky/plain/meta/conf/bitbake.conf?h=blinky

do_install () {
	# Same location access error
	#install -d ${D}${sysconfdir}
	#install -m 0755 ${B}/wpa_supplicant.conf ${D}${sysconfdir}/wpa_supplicant.conf
	
	#attempt for different location - github - successful
	#install -d ${D}${datadir}/custom
	#install -m 0755 ${B}/wpa_supplicant.conf ${D}${datadir}/custom/wpa_supplicant.conf

	#Article referred for usign file approach
	#http://embeddedguruji.blogspot.com/2019/02/yocto-recipe-to-copy-single-file-on.html
	#To figure out WORKDIR meaning
	#https://www.openembedded.org/pipermail/openembedded-core/2015-February/101990.html
	install -d ${D}${datadir}/custom
	install -m 0755 ${WORKDIR}/wpa_supplicant.conf ${D}${datadir}/custom/wpa_supplicant.conf

}


FILES_${PN} += "${datadir}/custom/wpa_supplicant.conf"

