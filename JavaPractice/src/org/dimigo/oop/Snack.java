/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_Snack
 * 1. 개요: 스낵 정보 및 총 구매금액 계산
 * 2. 작성일: 2015. 5. 19.
 * </pre>
 *
 * @author 신원준
 * @version 1.0
 */
public class Snack {
	
	private String name, company;
	private int price, number;

	//생성자
	public Snack() {
	}
	
	public Snack(String name, String company, int price, int number) {
		super();
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}

	//Getter & Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	//과자정보 출력
	public void printSnack() {
		System.out.println("이름: " + name);
		System.out.println("제조사: " + company);
		System.out.println("가격: " + String.format("%,d", price) + "원");
		System.out.println("개수: " + number + "개");
	}
	
	//가격 계산
	public int calcPrice() {
		return price * number;
	}

}
