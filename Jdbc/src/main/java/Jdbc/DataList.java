package Jdbc;

import java.util.Date;

public class DataList {
	
	int Id;
	int studentId;
	String name;
	long mobileNumber;
	String Email;
	String gender;
	String Dob;
	int yearOfJoin;
	String CourseId;
	String bloodGroup;
	int yearOfCourseCompletion;
	Date createdDate;
	String createdUser;
	Date updatedDate;
	String updatedUser;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public int getYearOfJoin() {
		return yearOfJoin;
	}
	public void setYearOfJoin(int yearOfJoin) {
		this.yearOfJoin = yearOfJoin;
	}
	public String getCourseId() {
		return CourseId;
	}
	public void setCourseId(String courseId) {
		CourseId = courseId;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getYearOfCourseCompletion() {
		return yearOfCourseCompletion;
	}
	public void setYearOfCourseCompletion(int yearOfCourseCompletion) {
		this.yearOfCourseCompletion = yearOfCourseCompletion;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getUpdatedUser() {
		return updatedUser;
	}
	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}
	
	
}
