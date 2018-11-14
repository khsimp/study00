package com.study.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main02 {

	public static void main(String[] args) {
		ConfigurableApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

		Audio audio = factory.getBean("audio", Audio.class);
		
		audio.volumnUp();
		audio.volumnUp();
		
		System.out.println(audio.toString());
		
		factory.close();
	}

}
