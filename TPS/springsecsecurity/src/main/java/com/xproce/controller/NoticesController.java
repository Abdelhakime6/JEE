package com.xproce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping("/notices")
    public String getNotices() {
        return "Here are the notices details from the DB";
    }

    @GetMapping("/")
    public String rootEndPoint() {
        return "Hello from the root of the app";
    }

}
