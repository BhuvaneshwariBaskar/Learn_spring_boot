//package com.example.learnspringboot.helloworld;
//
//import java.util.Arrays;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//public class Helloworld {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		//Spring Context
//		try(var context= new AnnotationConfigApplicationContext(HelloworldConfig.class)){
//			System.out.print(context.getBean("name"));
////			System.out.print(context.getBean("Person2"));
////			System.out.print(context.getBean(Person.class));
//			System.out.print(context.getBean("PersonMethod"));
//			System.out.print(context.getBean("PersonParameter"));
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//		}	
//	}	
//}
