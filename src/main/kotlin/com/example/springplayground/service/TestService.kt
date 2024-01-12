package com.example.springplayground.service

import com.example.springplayground.config.TestClass
import org.springframework.stereotype.Service
import org.springframework.transaction.event.TransactionalEventListener

@Service
class TestService(
) {

    @TransactionalEventListener
    fun test() {
    }
}