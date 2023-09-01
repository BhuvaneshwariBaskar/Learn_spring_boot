package com.example.learnspringboot.layers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component 
@Qualifier("MysqlServiceQualifier")
@ComponentScan 
public class MysqlService implements DataService{

	@Override
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3,4,5};
	}

}
