package com.example.springplayground.consumer

import com.example.springplayground.config.RabbitMQConfig
import org.springframework.amqp.AmqpRejectAndDontRequeueException
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component

@Component
class Receiver {

    @RabbitListener(queues = [RabbitMQConfig.QUEUE_NAME])
    fun receiveMessage(message: String) {
        try {
            println("Received <$message>")

            if (message == "ERROR") {
                print("ERROR $message")
                throw RuntimeException("Some exception happened")
            }
            println("SUCCESS")
        } catch (e: Exception) {
            throw AmqpRejectAndDontRequeueException(e)
        }
    }
}