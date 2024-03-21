package com.lumen.microservice.DbConnection.controller;

import com.lumen.microservice.DbConnection.model.Data;
import com.lumen.microservice.DbConnection.repository.DataRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DataController {
    @Autowired
    private DataRepository dataRepository;

    @GetMapping("/data")
    public List<Data> getAllData() {
        return dataRepository.getAllData();
    }
}