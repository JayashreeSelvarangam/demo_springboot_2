package com.springbootlearning.demolearningproject.example02;

import org.springframework.stereotype.Component;

@Component
    public class MySql implements DataService{

	@Override
	public int[] retriveData() {
		return new int[] {1,2,3};
	}


   }
