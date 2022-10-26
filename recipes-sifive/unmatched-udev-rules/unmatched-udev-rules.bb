SUMMARY = "udev rules for SiFive Unmatched"
LICENSE = "GPL-2.0-only"

PR = "r1"

SRC_URI:unmatched = "file://LICENSE.GPL2 \
                     file://99-pwm-leds.rules"

LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE.GPL2;md5=b234ee4d69f5fce4486a80fdaf4a4263"

S = "${WORKDIR}"

do_install() {
    install -d ${D}/etc/udev/rules.d
    install -m 644 ${B}/99-pwm-leds.rules ${D}/etc/udev/rules.d/
}

FILES:${PN} += "/etc/udev/rules.d/99-pwm-leds.rules"

COMPATIBLE_HOST = "riscv64.*"
COMPATIBLE_MACHINE = "unmatched"
