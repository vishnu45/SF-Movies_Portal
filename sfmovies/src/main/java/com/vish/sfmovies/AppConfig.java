package com.vish.sfmovies;

import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// for scanning all components present (in all packages) and create beans for them in the IoC for use elsewhere
// also componentScan scans only this package and children package (Not siblings or parent)
// so its important to have AppConfig on the base package
// @ComponentScan(basePackages={"io.vish", "io.vish.rest"}) 

@ComponentScan
public class AppConfig {
	
	// bean that returns a new HelloSpring object
	// creates an object here in the IoC container which can be called upon by others and later destroyed
//	@Bean
//	public HelloSpring getHello() {
//		return new HelloSpring();
//	}
}