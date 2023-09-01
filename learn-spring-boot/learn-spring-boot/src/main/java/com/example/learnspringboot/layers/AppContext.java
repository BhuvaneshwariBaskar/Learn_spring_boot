package com.example.learnspringboot.layers;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class AppContext {

	public static void main(String[] args) {
		//Spring Context
		try(var context=new AnnotationConfigApplicationContext(AppContext.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.print(context.getBean(BusinessCalculationService.class).findMax());
		}
	}
}
