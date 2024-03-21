package com.lumen.microservice.DbConnection.controller;

import com.lumen.microservice.DbConnection.model.Data2;
import com.lumen.microservice.DbConnection.repository.Data2Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api2")
public class Data2Controller {
    @Autowired
    private Data2Repository data2Repository;

    @GetMapping("/data2")
    public List<Data2> getAllData() {
        return data2Repository.getAllData();
    }
}