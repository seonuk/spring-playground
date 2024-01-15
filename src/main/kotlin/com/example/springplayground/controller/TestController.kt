package com.example.springplayground.controller

import com.example.springplayground.service.TestService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

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
        testService.testError()
    }
}