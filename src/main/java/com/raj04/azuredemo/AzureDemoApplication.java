package com.raj04.azuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureDemoApplication {

    @GetMapping("/message")
    public String message(){
        return "Congratulations! Your first App is deployed on azure";
    }
    public static void main(String[] args) {
        SpringApplication.run(AzureDemoApplication.class, args);
    }

}
