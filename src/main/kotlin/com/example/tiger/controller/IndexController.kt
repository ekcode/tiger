package com.example.tiger.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController {

    @GetMapping(path = ["/"])
    fun index(): Map<String, String> {
        return mapOf(Pair("Name", "Hello World"))
    }
}