require u-boot-renesas.inc

COMPATIBLE_MACHINE = "(rzg2h-family|rzg2l-family)"

SRCREV = "428d62406882493af7cfe510676dd14f4554ad40"
BRANCH = "v2021.10/rz-sr-cip41"
UBOOT_URL = "git://github.com/SolidRun/u-boot.git"

LIC_FILES_CHKSUM = "file://Licenses/README;md5=5a7450c57ffe5ae63fd732446b988025"

SRC_URI:append = " \
    file://0001-Use-boot-as-default-overlay-location.patch \
"
