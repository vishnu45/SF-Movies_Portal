package com.vish.sfmovies;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vish.sfmovies.AppConfig;
import com.vish.sfmovies.App;

public class Tester {
	
	public static void main(String[] args) {
		// instead instantiating an object with new keyword
		// manually initializing the context
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		App hello = context.getBean(App.class);		
		hello.sayHello();
		
		App hello2 = context.getBean(App.class);		
		hello2.sayHello();
		
		System.out.println(hello == hello2);
		
		// IoC container destroyed
		context.close();
	}

}

