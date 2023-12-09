package com.springbootlearning.demolearningproject.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
	var game = new Pacman();
	return game;
	}
	
	@Bean
	public GameRunner gameRunner() {
		var game = new GameRunner(game());
		return game;
	}
}
