package com.meshdrive.helloservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class HelloServiceApplication

fun main(args: Array<String>) {
    runApplication<HelloServiceApplication>(*args)
}
