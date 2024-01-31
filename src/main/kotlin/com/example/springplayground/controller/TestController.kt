package com.example.springplayground.controller

import com.example.springplayground.service.TestService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal
import java.math.RoundingMode

@RestController
class TestController(
    val testService: TestService
) {

    @GetMapping("/v1/test")
    fun test() {
        testService.test()
    }

    @GetMapping("/v1/error")
    fun testError() {

        val scale = BigDecimal.valueOf(1.3).setScale(0, RoundingMode.HALF_UP)
        println(scale)
        testService.testError()
    }
}