package com.example.springplayground

import com.example.springplayground.service.TestService
import org.springframework.boot.SpringApplication
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringPlaygroundApplication

fun main(args: Array<String>) {

    SpringApplication(SpringPlaygroundApplication::class.java).run(*args)

}
