package com.springbootlearning.demolearningproject.example03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
class A{
	
}

@Component
@Lazy // class B bean will not be initialized with spring context but it will be initialized whenever it is called
class B{
	private A a;
	public B(A a) {
		
		this.a= a; 
	}
}
    @Configuration   
    @ComponentScan
	public class LazyInitializer {
		public static void main(String[] args) {
			try(
					var context = new AnnotationConfigApplicationContext(LazyInitializer.class)){
			
			}
		}
	}

   