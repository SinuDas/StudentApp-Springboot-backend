package com.spring.fullstackproject.controller;


import com.spring.fullstackproject.entity.StudentData;
import com.spring.fullstackproject.service.StudentService;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:8081") 
@RequestMapping("/api")
public class StudentController {
   //Constructor Injection-used to inject object of service
     private StudentService Objectservice;

    @Autowired
    public StudentController(StudentService theStudentService) {
    	Objectservice = theStudentService;
    }


   // Method to save data from api to DataBase, linked to service and serviceimpl 
    @PostMapping("/StudentDatas")
    public ResponseEntity<StudentData>add(@RequestBody StudentData student) {
   //ResponseEntity used to get Http response
    Objectservice.Save(student);
    return  new ResponseEntity<>(student, HttpStatus.CREATED);
    }
    
    //Method to find Data from DataBase,linked to service and serviceimpl
    @GetMapping("/StudentDatas")
    public ResponseEntity<List<StudentData>> find(){
    	
     List<StudentData> student= Objectservice.findByOrderByNameAsc();    	
     return  new ResponseEntity<>( student,HttpStatus.OK);
    }

}
