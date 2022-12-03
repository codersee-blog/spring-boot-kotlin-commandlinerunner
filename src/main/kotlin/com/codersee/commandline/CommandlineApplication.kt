package com.codersee.commandline

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CommandlineApplication

fun main(args: Array<String>) {
	runApplication<CommandlineApplication>(*args)
}
