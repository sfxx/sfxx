package com.xx.test6;

public class Student implements java.io.Serializable{
	public String name;
	private String code;
	public static String sex;
	public transient String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public static String getSex() {
		return sex;
	}
	public static void setSex(String sex) {
		Student.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}
