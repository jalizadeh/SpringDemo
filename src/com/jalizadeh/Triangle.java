package com.jalizadeh;

public class Triangle {
	
	//video #5
	private String type;
	
	
	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}

	//#5------------


	//#6
	private int height;
	private int length;
	
	public int getHeight() {
		return height;
	}
	
	public int getLenght() {
		return length;
	}
	
	public Triangle(int height) {
		this.height = height;
	}
	
	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}
	//#6---------------------
	
	public void draw() {
		System.out.println(getType() + " Triangle drawn " + getHeight());
	}
}
