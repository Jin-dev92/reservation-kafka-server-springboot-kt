package com.jindevst.springbootcleanarchboilterplate

import jakarta.annotation.PostConstruct
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import java.util.*

@EnableJpaAuditing
@SpringBootApplication
class SpringbootCleanArchBoilterplateApplication

@PostConstruct
fun init() {
    TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"))
}

fun main(args: Array<String>) {
    runApplication<SpringbootCleanArchBoilterplateApplication>(*args)
}
