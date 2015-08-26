/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_IPhone
 * 1. 개요: 아이폰 클래스
 * 2. 작성일: 2015. 8. 25.
 * </pre>
 *
 * @author 신원준
 * @version 1.0
 */
public class IPhone extends SmartPhone{
	//기본 생성자
	public IPhone() {
	}
	
	//생성자
	public IPhone(String model, String company, int price) {
		super(model, company, price);
	}
	
	//pay 메소드 오버라이딩
	public void pay() {
		System.out.print("애플");
		super.pay();
	}
	
	//AirDrop 메소드
	public void useAirDrop() {
		System.out.println("AirDrop 기능을 사용합니다.");
	}
}
