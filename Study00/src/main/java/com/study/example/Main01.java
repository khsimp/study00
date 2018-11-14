package com.study.example;


public class Main01 {

	public static void main(String[] args) {
		// 객체 생성
		Audio audio = new Audio();
		audio.setName("Sony");
		audio.setVolumn(10);
		audio.setMaxVolumn(30);
		
		//or
		//Audio audio = new Audio("Sony", 30, 10);
		
		audio.volumnUp();
		audio.volumnUp();
		
		System.out.println(audio.toString());
	}

}
