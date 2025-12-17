package com.example.demo.controller;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.studententity;
import com.example.demo.service.Studservice;
@RestContoller
@RequestMapping("/student")
public class Studctl{
    @Autowired
    private Studeservice ser;
    //POST
    @PostMapping("/add")
    
}