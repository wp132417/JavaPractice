package org.dimigo.oop;

/**
 * org.dimigo.oop
 * 	 |_Car2
 * 1. 개요: 생성자 추가해서 클래스 만들기
 * 2. 작성일: 2015. 4. 14.
 *
 * @author 신원준
 * @version 1.0
 */

public class Car3 {
	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	//생성자
	public Car3() {
	}
	
	public Car3(String company, String model, String color, int maxSpeed, int price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	
	public Car3(String company, String model, String color, int maxSpeed) {
		this(company, model, color, maxSpeed, 0);
	}
	
	public Car3(String company, String model, String color) {
		this(company, model, color, 0);
	}
	
	//값 리턴 메소드
	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public int getPrice() {
		return price;
	}

}
