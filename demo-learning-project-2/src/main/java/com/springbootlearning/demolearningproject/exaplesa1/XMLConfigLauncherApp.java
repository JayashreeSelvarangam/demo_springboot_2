package com.springbootlearning.demolearningproject.exaplesa1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springbootlearning.demolearningproject.game.GameRunner;
import com.springbootlearning.demolearningproject.game.GamingConsole;
import com.springbootlearning.demolearningproject.game.Pacman;

@Configuration
@ComponentScan("com.springbootlearning.demolearningproject.exaplesa1")
public class XMLConfigLauncherApp {


	
	public static void main(String[] args) {
	try(
	var context = new ClassPathXmlApplicationContext("ContextConfig.xml")){
		System.out.println(context.getBean("name"));
	}
	}
}


