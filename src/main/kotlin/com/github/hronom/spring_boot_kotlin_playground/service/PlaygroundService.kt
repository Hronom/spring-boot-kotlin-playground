package com.github.hronom.spring_boot_kotlin_playground.service

import com.github.hronom.spring_boot_kotlin_playground.controller.pojo.PlaygroundEntity
import com.github.hronom.spring_boot_kotlin_playground.utils.generateRandomText
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.util.concurrent.ThreadLocalRandom

@Service
class PlaygroundService {
    private val logger = LoggerFactory.getLogger(PlaygroundService::class.java);

    fun getPlaygroundEntity() : PlaygroundEntity {
        logger.info("Get playground entity")
        return PlaygroundEntity(
            ThreadLocalRandom.current().nextInt(),
            ThreadLocalRandom.current().nextDouble(),
            generateRandomText()
        )
    }
}