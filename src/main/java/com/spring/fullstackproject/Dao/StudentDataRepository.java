package com.spring.fullstackproject.Dao;


import com.spring.fullstackproject.entity.StudentData;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentDataRepository extends MongoRepository<StudentData, String>{

//SpringDataJpa Method to findData from Table by ascending order of name
	List<StudentData> findByOrderByNameAsc();
}
