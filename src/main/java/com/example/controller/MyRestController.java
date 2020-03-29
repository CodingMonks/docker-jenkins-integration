package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.Date;

@RestController
public class MyRestController {

    @GetMapping("/welcome")
        public String welcome()
        {
            return "Hello on " + new Date();
        }
}
