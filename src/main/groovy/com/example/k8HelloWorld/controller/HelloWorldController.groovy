package com.example.k8HelloWorld.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping('/hello')
    public String hello() {
        return 'Hello World, welcome to the world of kubernetes!!'
    }
}
