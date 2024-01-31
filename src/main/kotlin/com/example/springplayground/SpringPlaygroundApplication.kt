package com.example.springplayground

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringPlaygroundApplication

fun main(args: Array<String>) {

    SpringApplication(SpringPlaygroundApplication::class.java).run(*args)

}
