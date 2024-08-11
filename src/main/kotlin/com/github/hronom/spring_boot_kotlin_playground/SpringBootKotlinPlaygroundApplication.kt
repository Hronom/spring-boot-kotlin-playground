package com.github.hronom.spring_boot_kotlin_playground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootKotlinPlaygroundApplication

fun main(args: Array<String>) {
	runApplication<SpringBootKotlinPlaygroundApplication>(*args)
}
