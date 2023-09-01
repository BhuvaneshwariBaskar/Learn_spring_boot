package com.example.learnspringboot.model;

public class Person {
	private String name;
	private Number age;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Number getAge() {
		return age;
	}
	public void setAge(Number age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
	
	
}
