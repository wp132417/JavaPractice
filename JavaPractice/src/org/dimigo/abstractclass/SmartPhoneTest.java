/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_SmartPhoneTest
 * 1. 개요: SmartPhone, Galaxy, IPhone 클래스 테스트
 * 2. 작성일: 2015. 8. 25.
 * </pre>
 *
 * @author 신원준
 * @version 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		//IPhone, Galaxy 객체 생성
		Galaxy g = new Galaxy("갤럭시 S6", "삼성", 650000);
		IPhone i = new IPhone("iPhone 6", "애플", 700000);
		
		//iPhone
		System.out.println(i);
		i.turnOn();
		i.pay();
		i.useSpecialFunction();
		i.turnOff();
		
		System.out.println();
		
		//Galaxy
		System.out.println(g);
		g.turnOn();
		g.pay();
		g.useSpecialFunction();
		g.turnOff();
	}

}
