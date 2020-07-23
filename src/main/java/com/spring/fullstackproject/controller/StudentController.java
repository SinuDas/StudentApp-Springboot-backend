package com.spring.fullstackproject.controller;


import com.spring.fullstackproject.entity.StudentData;
import com.spring.fullstackproject.service.StudentService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
 @CrossOrigin("http://localhost:8081") 
@RequestMapping("/api")
public class StudentController {
     private StudentService std;

    @Autowired
    public StudentController(StudentService theStudentService) {
        std = theStudentService;
    }



    @PostMapping("/StudentDatas")
    public ResponseEntity<StudentData>add(@Valid @RequestBody StudentData student) {

      std.Save(student);
       
		return  new ResponseEntity<>(student, HttpStatus.CREATED);

    }
    @GetMapping("/StudentDatas")
    public ResponseEntity<List<StudentData>> find(){
    	
         List<StudentData> student= std.findByOrderByNameAsc();    	
    	return  new ResponseEntity<>( student,HttpStatus.OK);
    }

}
