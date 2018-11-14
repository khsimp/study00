package com.study.example2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.study.example2.pencil.Pencil;

public class Main02 {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext2.xml");

		Pencil pencil = factory.getBean("pencil", Pencil.class);
		pencil.use();
		
		factory.close();
	}

}
