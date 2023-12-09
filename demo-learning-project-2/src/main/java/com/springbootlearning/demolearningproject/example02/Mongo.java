package com.springbootlearning.demolearningproject.example02;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mongo implements DataService{

	@Override
	public int[] retriveData() {
		return new int[] {11,22,33};
	}

}
