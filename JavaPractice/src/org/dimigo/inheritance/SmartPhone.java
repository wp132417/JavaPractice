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
	//필드 생성
	private String model;
	private String company;
	private int price;
	
	//기본 생성자
	public SmartPhone() {
	}
	
	//생성자
	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	//전원 켜기 메소드
	public void turnOn() {
		System.out.println(model + "의 전원을 켭니다.");
	}
	
	//전원 끄기 메소드
	public void turnOff() {
		System.out.println(model + "의 전원을 끕니다.");
	}
	
	//페이 결제 메소드
	public void pay() {
		System.out.println(" 페이로 결제합니다.");
	}
	
	//브랜드 별 특정 기능 수행
	public void useSpecialFunction() {
		if (this instanceof Galaxy) {				//갤럭시일 경우
			((Galaxy) this).useWirelessCharging();
		} else if(this instanceof IPhone) {			//아이폰일 경우
			((IPhone) this).useAirDrop();
		}
	}

	// toString 메소드 오버라이딩
	@Override
	public String toString() {
		return "모델명 : " + model + ", 제조사 : " + company + ", 가격 : " + String.format("%,d", price) + "원";
	}
}
