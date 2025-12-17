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
    public studententity addStudent(@RequestBody Studententity st){
        return ser.saveData(st);
    }
    //GET ALL
    @GETMapping("/getall")
    public Collection<Studententity>getAllStudents(){
        return ser.getAll();
    }
    //GET BY ID 
    @GetMapping("/get/{id}")
    public Studententity getStudentById(@PathVariable int id) {
        return ser.getById(id);
    }
    //PUT(UPDATE)
    @PutMapping("/update/{id}")
    public Studententity updateStudent(
        @PathVariable int id;
        @RequestMapping Studententity st){
            return ser.update(id,st);
        }
}

       