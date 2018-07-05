package com.xx.test3;

public class Student implements StudentInfo{

	private String name;
	private String age;
	private boolean isStudent;
	private Integer grade;

	public Student(String name, Integer grade) {
		this.name=name;
		this.grade=grade;
		// TODO Auto-generated constructor stub
	}
	public boolean getIsStudent() {
		return isStudent;
	}
	public void setIsStudent(boolean isStudent) {
		this.isStudent = isStudent;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	
	@Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return this.name.equals(((Student)obj).name) && this.grade== ((Student)obj).grade;
    }
	
	public int hashCode() {
        // TODO Auto-generated method stub
        return name.hashCode()*37;
    }
}
