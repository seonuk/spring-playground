//package com.example.springbatch
//
//import org.springframework.batch.core.Job
//import org.springframework.batch.core.Step
//import org.springframework.batch.core.configuration.annotation.StepScope
//import org.springframework.batch.core.job.builder.JobBuilder
//import org.springframework.batch.core.repository.JobRepository
//import org.springframework.batch.core.step.builder.StepBuilder
//import org.springframework.batch.core.step.tasklet.Tasklet
//import org.springframework.batch.repeat.RepeatStatus
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//
//@Configuration
//@ConditionalOnProperty(name = ["spring.batch.job.names"], havingValue = BatchConfig.JOB_NAME)
//class BatchConfig {
//    @Bean(JOB_NAME)
//    fun batchJob(
//        jobRepository: JobRepository
//    ): Job {
//        return JobBuilder(JOB_NAME, jobRepository)
//            .start(testStart(jobRepository))
//            .build()
//
//    }
//
//    @StepScope
//    fun testStart(jobRepository: JobRepository): Step {
//        return StepBuilder("testStart", jobRepository)
//            .tasklet(testTasklet(), TransactionManager())
//            .build()
//    }
//
//    private fun testTasklet(): Tasklet {
//
//        return Tasklet { _, _ ->
//            print("testTasklet")
//            RepeatStatus.FINISHED
//        }
//    }
//
//    companion object {
//        const val JOB_NAME = "testJob"
//    }
//}