package com.github.hronom.spring_boot_kotlin_playground.controller

import com.github.hronom.spring_boot_kotlin_playground.controller.pojo.PlaygroundEntity
import com.github.hronom.spring_boot_kotlin_playground.service.PlaygroundService
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(
    private val playgroundService: PlaygroundService
) {

    private val logger = LoggerFactory.getLogger(HelloController::class.java);

    @GetMapping("/hello")
    fun getHello(): String {
        return "Hello World!"
    }

    @GetMapping("/test")
    fun getPlaygroundEntity(): PlaygroundEntity {
        return playgroundService.getPlaygroundEntity()
    }
}