package com.example.learnspringboot.layers;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class BusinessCalculationService {
	
	
	private DataService dataservice;
	
	@Autowired
	public BusinessCalculationService(@Qualifier("MysqlServiceQualifier") DataService dataservice) {
		super();
		this.dataservice = dataservice;
	}


	public int findMax() {
		return Arrays.stream( dataservice.retrieveData()).max().orElse(0);
	}
}
