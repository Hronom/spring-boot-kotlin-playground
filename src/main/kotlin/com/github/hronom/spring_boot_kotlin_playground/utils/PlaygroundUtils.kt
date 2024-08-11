package com.github.hronom.spring_boot_kotlin_playground.utils

import java.util.concurrent.ThreadLocalRandom
import kotlin.streams.toList

fun generateRandomText(): String {

    return ThreadLocalRandom
        .current()
        .ints(5, 0, 1000000)
        .toList()
        .joinToString { it.toString() }
}