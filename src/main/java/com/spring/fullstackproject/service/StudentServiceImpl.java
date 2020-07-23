package com.spring.fullstackproject.service;

import com.spring.fullstackproject.Dao.StudentDataRepository;
import com.spring.fullstackproject.entity.StudentData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService {
    private StudentDataRepository strd;

    @Autowired
    public StudentServiceImpl( StudentDataRepository theStudentDataRepository) {
        strd = theStudentDataRepository;
    }

    public void Save(StudentData student){
       strd.save(student);
       
    }
//    public List<StudentData> findAllOrderByName() {
//    	List<StudentData> student=strd.findAllOrderByName();
//    	return student;
//    	
//    }

	@Override
	public List<StudentData> findByOrderByNameAsc() {
   	List<StudentData> student=strd. findByOrderByNameAsc();

		return student;
	}
    

	
	}

	

	

