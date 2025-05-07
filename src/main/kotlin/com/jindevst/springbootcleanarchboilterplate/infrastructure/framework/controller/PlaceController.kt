package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/places")
class PlaceController {

    @PostMapping("/")
    fun createPlace() {
    }
}