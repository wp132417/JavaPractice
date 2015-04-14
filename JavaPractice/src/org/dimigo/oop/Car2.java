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

public class Car2 {
	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	//생성자
	public Car2() {
	}
	
	public Car2(String nCompany, String nModel, String nColor, int nMaxSpeed, int nPrice) {
		company = nCompany;
		model = nModel;
		color = nColor;
		maxSpeed = nMaxSpeed;
		price = nPrice;
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
