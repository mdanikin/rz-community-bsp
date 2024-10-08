DESCRIPTION = "Linux stable kernel"

require linux.inc

KBRANCH = "linux-6.9.y-solidrun"
SRCREV = "f9315e3bfccb1c3c8288b452450ed3ddcc3be7cb"
SRC_URI = "git://github.com/amotus/linux-renesas;protocol=https;branch=${KBRANCH}"

SRC_URI:append = " \
    file://0001-arm64-dts-renesas-Cleanup-HummingBoard-RZG2LC-Device.patch \
    file://0002-arm64-dts-renesas-Add-overlays-for-SD-and-eMMC-suppo.patch \
    file://0003-arm64-defconfig-Enable-ADIN1100-PHY-driver-in-rz-sol.patch \
"

LINUX_VERSION = "6.9.7"

COMPATIBLE_MACHINE = "(rzg2h-family|rzg2l-family)"
