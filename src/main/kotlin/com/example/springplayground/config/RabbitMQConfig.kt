package com.example.springplayground.config

import org.springframework.amqp.core.*
import org.springframework.amqp.rabbit.connection.ConnectionFactory
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.amqp.support.converter.MessageConverter
import org.springframework.amqp.support.converter.SimpleMessageConverter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RabbitMQConfig {


    @Bean
    fun queue(): Queue {
        return QueueBuilder.nonDurable(QUEUE_NAME)
            .deadLetterExchange("")
            .deadLetterRoutingKey("$QUEUE_NAME.dlq")
            .build()
    }

    @Bean
    fun DLQ(): Queue {
        return Queue("$QUEUE_NAME.dlq", false)
    }

    @Bean
    fun exchange(): TopicExchange {
        return TopicExchange(EXCHAGE_NAME)
    }

    @Bean
    fun binding(queue: Queue, exchange: TopicExchange): Binding {
        return BindingBuilder.bind(queue).to(exchange).with("foo.bar.#")
    }

    @Bean
    fun rabbitTemplate(connectionFactory: ConnectionFactory, messageConverter: MessageConverter): RabbitTemplate {
        val rabbitTemplate = RabbitTemplate(connectionFactory)
        rabbitTemplate.messageConverter = messageConverter
        return rabbitTemplate
    }

    @Bean
    fun messageConverter(): MessageConverter {
        return SimpleMessageConverter()
    }

    companion object {
        const val QUEUE_NAME = "test-queue"
        const val EXCHAGE_NAME = "test-exchange"
    }
}