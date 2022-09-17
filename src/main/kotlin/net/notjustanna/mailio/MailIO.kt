package net.notjustanna.mailio

import net.notjustanna.mailio.MailDownloadJobFactory.Protocol.IMAP

fun main() {
    MailDownloadJobFactory(
        IMAP, "imap.example.com", "993", "example@example.com", "example_password"
    ).create().run()
}
