package com.training.pms.handsonjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HandsOnJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HandsOnJenkinsApplication.class, args);
    }
    @GetMapping
    public String getMessage()
    {
        return "Hello From Shikhar";
    }
}
