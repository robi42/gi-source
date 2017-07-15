package net.robi42.gisource

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

fun main(args: Array<String>) {
    SpringApplication.run(GiSourceApplication::class.java, *args)
}

@SpringBootApplication
class GiSourceApplication
