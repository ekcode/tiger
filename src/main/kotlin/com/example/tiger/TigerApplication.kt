package com.example.tiger

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TigerApplication

fun main(args: Array<String>) {
    runApplication<TigerApplication>(*args)
}
