package org.dimigo.oop;

/**
 * org.dimigo.oop
 * 	 |_Car
 * 1. 개요: 
 * 2. 작성일: 2015. 4. 13.
 *
 * @author 신원준
 * @version 1.0
 */

public class Car {
	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
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
	
	//값 설정 메소드
	public void setCompany(String nCompany) {
		company = nCompany;
	}
	
	public void setModel(String nModel) {
		model = nModel;
	}
	
	public void setColor(String nColor) {
		color = nColor;
	}
	
	public void setMaxSpeed(int nMaxSpeed) {
		maxSpeed = nMaxSpeed;
	}
	
	public void setPrice(int nPrice) {
		price = nPrice;
	}

}
