package com.springbootlearning.demolearningproject.example02;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component

public class BusinessCalc {

	private DataService dataService;
	
	
	public BusinessCalc(DataService dataService) {
	super();
	this.dataService = dataService;
	}
	
	public int findMax() {
		return Arrays.stream(dataService.retriveData()).max().orElse(0);
	}
}
