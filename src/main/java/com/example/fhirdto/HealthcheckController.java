package com.example.fhirdto;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthcheckController {
    @GetMapping(value = {"/fhir"}, produces = "application/json")
    String healthcheck(){
        return "ok";
    }
}
