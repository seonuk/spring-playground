//package com.example.springbatch
//
//import com.mongodb.client.MongoClient
//import com.mongodb.client.MongoClients
//import org.springframework.beans.factory.annotation.Value
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.data.mongodb.core.MongoTemplate
//
//@Configuration
//class MongoConfi(
//    @Value("\${spring.data.mongodb.uri}")
//    private val uri: String
//) {
//
//    @Bean
//    fun mongoClient(): MongoClient {
//        return MongoClients.create(uri)
//    }
//
//    @Bean
//    fun mongoTemplate(): MongoTemplate {
//        return MongoTemplate(mongoClient(), "billing")
//    }
//}