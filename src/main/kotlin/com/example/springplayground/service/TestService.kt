package com.example.springplayground.service

import com.example.springplayground.config.RabbitMQConfig
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.stereotype.Service

@Service
class TestService(
    private val rabbitTemplate: RabbitTemplate
) {

    fun test() {
        println("RabbitTempalte")
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHAGE_NAME, "foo.bar.baz", "Hello from RabbitMQ!")
    }

    fun testError() {
        println("Occur Error")
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHAGE_NAME, "foo.bar.baz", "ERROR")
    }
}