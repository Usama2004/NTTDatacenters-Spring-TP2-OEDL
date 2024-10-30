package com.nttdata.nttdatacenters_spring_t2_OEDL.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String home() {
        return "¡Hola Mundo TP3 De Spring Boot 2222!";
    }
}

