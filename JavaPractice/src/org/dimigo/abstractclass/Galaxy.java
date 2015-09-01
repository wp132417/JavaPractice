/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_Galaxy
 * 1. 개요: 갤럭시 클래스
 * 2. 작성일: 2015. 8. 25.
 * </pre>
 *
 * @author 신원준
 * @version 1.0
 */
public class Galaxy extends SmartPhone {
	//기본 생성자
	public Galaxy() {
	}
	
	//생성자
	public Galaxy(String model, String company, int price) {
		super(model, company, price);
	}
	
	//pay 메소드 오버라이딩
	public void pay() {
		System.out.print("삼성 페이로 결제합니다.");
	}
	
	//무선 충전 메소드
	public void useWirelessCharging() {
		System.out.println("무선 충전 기능을 이용합니다.");
	}
}
