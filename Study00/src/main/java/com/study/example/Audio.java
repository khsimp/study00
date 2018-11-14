package com.study.example;

public class Audio {
	private String name = "Empty";
	private int volumn = 5;
	private int maxVolumn = 20;
	
	public Audio() {
		System.out.println("===========> 생성자 시작");
	}
	public Audio(String name, int volumn, int maxVolumn) {
		System.out.println("===========> 생성자 시작");
		this.name = name;
		this.volumn = volumn;
		this.maxVolumn = maxVolumn;
	}
	
	public void volumnUp() {
		System.out.println("===========> Volumn Up!!");
		
		if ( volumn < maxVolumn ) {
			volumn++;
		}
	}
	public void volumnDown() {
		System.out.println("===========> Volumn Down!!");
		if ( volumn > 0 ) {
			volumn--;
		}
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVolumn() {
		return volumn;
	}
	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	public int getMaxVolumn() {
		return maxVolumn;
	}
	public void setMaxVolumn(int maxVolumn) {
		this.maxVolumn = maxVolumn;
	}
	
	@Override
	public String toString() {
		return "Audio [name=" + name + ", volumn=" + volumn + ", maxVolumn="
				+ maxVolumn + "]";
	}
}
