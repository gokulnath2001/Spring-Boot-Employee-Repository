package com.employeeRestService.app.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class RootController {
    @GetMapping("/")
    public ResponseEntity<String> getApp() {
        return ResponseEntity.status(HttpStatus.OK).body("HOIII");
    }
}
