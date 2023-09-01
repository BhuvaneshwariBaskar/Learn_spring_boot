//package com.example.learnspringboot.helloworld;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//record Person(String name,Number age,String city) {};
//@Configuration
//public class HelloworldConfig {
//	
//	@Bean
//	public String name() {
//		return "Bhuvana";
//		
//	}
//	@Bean
//	public Number age() {
//		return 20;
//		
//	}
//	@Bean
//	public String city() {
//		return "Chennai";
//		
//	}
////	@Bean(name="Person2")
////	public Person Person() {
////		return new Person("Name",20,"Chennai");
////		
////	}
//	@Bean
//	public Person PersonMethod() {
//		return new Person(name(),15,"Trichy");
//		
//	}
//	@Bean
////	@Primary
////	@Qualifier("hello")
//	public Person PersonParameter(@Qualifier("hello") String name,Number age,String city) {
//		return new Person(name,age,city);
//		
//	}
//	
//}
