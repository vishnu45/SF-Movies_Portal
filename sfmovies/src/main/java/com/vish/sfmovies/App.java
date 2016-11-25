package com.vish.sfmovies;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// used instead of bean annotations in AppConfig
@Component
// to work without having singleton
@Scope("prototype")
public class App {
	
	// We cannot use component in this case where there is a parameterized constructor, since the default constructor will no longer exist
//	public HelloSpring(String name) {
//		
//	}
	
	public void sayHello() {
		System.out.println("Hello Spring");
	}
	
}