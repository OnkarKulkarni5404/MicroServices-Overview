package com.StudentClient.beans;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection="student")
public class Student {
	@Id
	private String studentId;
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	private int rollNo;
	
	private String name;
	private Branch branch;
	private Gender gender;
	private String phone;
	private String email;
	private String city;
	
	public Student(){}
	
	public Student(Integer rollNo, String name, Branch branch, Gender gender) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
		this.gender = gender;
	}

	public Student(Integer rollNo, String name, Branch branch, Gender gender,
			String phone, String email, String city) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.city = city;
	}
	
	public Student(String studentId, Integer rollNo, String name,
			Branch branch, Gender gender, String phone, String email,
			String city) {
		super();
		this.studentId = studentId;
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.city = city;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", branch="
				+ branch + ", gender=" + gender + ", phone=" + phone
				+ ", email=" + email + ", city=" + city + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((studentId == null) ? 0 : studentId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentId == null) {
			if (other.studentId != null)
				return false;
		} else if (!studentId.equals(other.studentId))
			return false;
		return true;
	}
	
	
}
