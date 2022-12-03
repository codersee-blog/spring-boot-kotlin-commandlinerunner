package com.codersee.commandline

import org.springframework.boot.CommandLineRunner
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Component
@Order(1)
class WillBeInvokedFirst : CommandLineRunner {

    override fun run(vararg args: String) {
        print("Hello, ")
    }
}