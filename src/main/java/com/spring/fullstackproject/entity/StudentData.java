package com.spring.fullstackproject.entity;




import org.springframework.data.mongodb.core.mapping.Document;






//collection name in database
@Document(collection = "student_info")

  public class StudentData {
    
    private String id;
   
    private String name;
   
    private String dob;
   
    private String classes;
   
   private String division;
  
   private String gender;
   

    public StudentData() {
        super();
    }


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getClasses() {
		return classes;
	}


	public void setClasses(String classes) {
		this.classes = classes;
	}


	public String getDivision() {
		return division;
	}


	public void setDivision(String division) {
		this.division = division;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public StudentData(String id, String name, String dob, String classes, String division, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.classes = classes;
		this.division = division;
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + ", dob=" + dob + ", classes=" + classes + ", division="
				+ division + ", gender=" + gender + "]";
	}


	






	

}
