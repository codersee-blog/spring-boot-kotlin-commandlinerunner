package com.codersee.commandline

import org.springframework.boot.CommandLineRunner
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Component
@Order(2)
class WillBeInvokedSecond : CommandLineRunner {

    override fun run(vararg args: String) {
        println("World!")
    }
}