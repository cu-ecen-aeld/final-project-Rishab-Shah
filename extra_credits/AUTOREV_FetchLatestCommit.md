## Automatically fetch latest commit
After enabling this, the latest commit will always be fetched from the the referenced github repo.

Example:
 * NAME_OF_SOURCE_REPO = final-project-Rishab-Shah
```
# Set path to the source code github repo being referred
SRC_URI = "git://git@github.com/cu-ecen-aeld/NAME_OF_SOURCE_REPO.git;protocol=ssh;branch=master"
# Set the version of the github
PV = "1.0+git${SRCPV}"
# Set to reference a specific commit hash in your assignment repo
SRCREV = "12354123u5091u5490148501984523456q345"
```
 * Required configuration changes are as follows in bb file
```
# Set path to the source code github repo being referred
SRC_URI = "git://git@github.com/cu-ecen-aeld/NAME_OF_SOURCE_REPO.git;protocol=ssh;branch=master"
# Set the version of the github
PV = "1.0+git${SRCPV}"
# Set to reference a specific commit hash in your assignment repo
SRCREV = "${AUTOREV}"
```
 * Sample example for usage:
```
# Set path to the source code github repo being referred
SRC_URI = "git://git@github.com/cu-ecen-aeld/final-project-Rishab-Shah.git;protocol=ssh;branch=master"
# Set the version of the github
PV = "1.0+git${SRCPV}"
# Set to reference a specific commit hash in your assignment repo
SRCREV = "${AUTOREV}"
```
 * References:
<br> https://stackoverflow.com/questions/38370723/how-to-configure-yocto-to-use-the-latest-git-commit
