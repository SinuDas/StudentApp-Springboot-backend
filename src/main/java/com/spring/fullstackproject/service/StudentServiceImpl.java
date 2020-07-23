package com.spring.fullstackproject.service;

import com.spring.fullstackproject.Dao.StudentDataRepository;
import com.spring.fullstackproject.entity.StudentData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService {
    private StudentDataRepository Objectrepository;
    //ConstructorInjection -here the object of StudentDataRepository(interface) will be injected
    @Autowired
    public StudentServiceImpl( StudentDataRepository theStudentDataRepository) {
    	Objectrepository = theStudentDataRepository;
    }
     //it is a method to save data,methods from spring data jpa used here like save,findByOrderByNameAsc() methods;
    public void Save(StudentData student){
    	Objectrepository.save(student);
       //save is a method from hibernate and Spring data jpa
    }

	@Override
	public List<StudentData> findByOrderByNameAsc() {
   	List<StudentData> student=Objectrepository. findByOrderByNameAsc();

		return student;
    }
}
	

	

