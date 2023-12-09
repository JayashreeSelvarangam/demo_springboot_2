package com.springbootlearning.demolearningproject.example02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
    @Configuration
    @ComponentScan
	public class RealWorldSpringContext {
		public static void main(String[] args) {
			try(
					var context = new AnnotationConfigApplicationContext(RealWorldSpringContext.class)){
				System.out.println(	context.getBean(BusinessCalc.class).findMax());
				
			}
		}
	}
