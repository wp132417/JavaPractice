/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_SmartPhone
 * 1. 개요: 스마트폰 클래스
 * 2. 작성일: 2015. 8. 25.
 * </pre>
 *
 * @author 신원준
 * @version 1.0
 */
public class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone() {
	}
	
	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn() {
		System.out.println(model + "의 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println(model + "의 전원을 끕니다.");
	}
	
	public void pay() {
		System.out.println(" 페이로 결제합니다.");
	}
	
	public void useSpecialFunction() {
		if (this instanceof Galaxy) {
			((Galaxy) this).useWirelessCharging();
		} else if(this instanceof IPhone) {
			((IPhone) this).useAirDrop();
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "모델명 : " + model + ", 제조사 : " + company + ", 가격 : " + String.format("%,d", price) + "원";
	}
}
