package com.example.learnspringboot.layers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
@Primary
public class MongoService implements DataService{

	@Override
	public int[] retrieveData() {

			return new int[] {11,22,33,44,55};
	}

}
