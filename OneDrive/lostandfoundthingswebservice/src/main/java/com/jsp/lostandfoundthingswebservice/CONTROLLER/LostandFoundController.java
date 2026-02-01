package com.jsp.lostandfoundthingswebservice.CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.lostandfoundthingswebservice.DTO.LostandFound;
import com.jsp.lostandfoundthingswebservice.SERVICE.*;

@RestController
public class LostandFoundController {

    @Autowired
    private LostandFoundService service;

    @PostMapping("/lostfound")
    public LostandFound storeLostandFound(@RequestBody LostandFound LostandFound) {
        return service.insertLostandFound(LostandFound);
    }
}