package com.example.kttkpmtuan7.controller;


import com.example.kttkpmtuan7.model.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Restemplate")
public class RestTemplateController {

    @Autowired
    private RestTemplateService restTemplateService;

    public ResponseEntity<String> getAllEmployee(){
        return restTemplateService.allUser();

    }

}
