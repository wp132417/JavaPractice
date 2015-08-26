/**
 * 
 */
package org.dimigo.inheritance;

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
	public Galaxy() {}
	public Galaxy(String model, String company, int price) {
		super(model, company, price);
	}
	
	public void pay() {
		System.out.print("삼성");
		super.pay();
	}
	
	public void useWirelessCharging() {
		System.out.println("무선 충전 기능을 이용합니다.");
	}
}
