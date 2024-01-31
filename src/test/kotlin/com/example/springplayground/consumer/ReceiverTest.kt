package com.example.springplayground.consumer

import org.junit.jupiter.api.Test
import java.math.BigDecimal


class ReceiverTest {


    @Test
    fun testReceiveMessage() {
        val scale = BigDecimal.valueOf(1.53).setScale(0, BigDecimal.ROUND_HALF_UP)
        println(scale)
    }
}
