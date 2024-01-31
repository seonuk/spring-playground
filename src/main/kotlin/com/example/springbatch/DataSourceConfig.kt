//package com.example.springbatch
//
//import org.springframework.beans.factory.annotation.Value
//import org.springframework.context.annotation.Configuration
//
//@Configuration
//class DataSourceConfig(
//    @Value("\${spring.datasource.url}")
//    val url: String,
//    @Value("\${spring.datasource.username}")
//    val userName: String,
//    @Value("\${spring.datasource.password}")
//    val password: String
//) {
//
////    @Bean
////    fun transactionManager(dataSourceConfig: DataSourceConfig): DataSourceTransactionManger {
////        return TransactionManager(dataSourceConfig)
////    }
//}