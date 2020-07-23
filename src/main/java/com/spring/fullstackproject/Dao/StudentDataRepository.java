package com.spring.fullstackproject.Dao;


import com.spring.fullstackproject.entity.StudentData;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

/*@CrossOrigin("http://localhost:8081")*/
@Repository
public interface StudentDataRepository extends MongoRepository<StudentData, String>{


	List<StudentData> findByOrderByNameAsc();
}
