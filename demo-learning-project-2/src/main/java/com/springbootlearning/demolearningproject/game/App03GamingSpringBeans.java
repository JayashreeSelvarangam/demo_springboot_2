package com.springbootlearning.demolearningproject.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springbootlearning.demolearningproject.game")
public class App03GamingSpringBeans {

//	@Bean
//	public GamingConsole game() {
//	var game = new Pacman();
//	return game;
//	}
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		var game1 = new GameRunner(game);
//		return game1;
//	}
	
	public static void main(String[] args) {
	try(
	var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)){
	context.getBean(GamingConsole.class).up();
	System.out.println(context.getBean(GameRunner.class));
	}
	}
}


