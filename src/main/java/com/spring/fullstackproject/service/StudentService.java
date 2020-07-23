package com.spring.fullstackproject.service;

import java.util.List;

import com.spring.fullstackproject.entity.StudentData;

public interface StudentService {
    public void Save(StudentData student);
    List<StudentData> findByOrderByNameAsc();
}
