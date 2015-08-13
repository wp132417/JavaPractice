/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_Circle
 * 1. 개요: 원 클래스
 * 2. 작성일: 2015. 8. 12.
 * </pre>
 *
 * @author 신원준
 * @version 1.0
 */

public class Circle extends Figure {
	private int radius;		//반지름
	
	//생성자 - 반지름 초기화(중심좌표는 0, 0)
	public Circle(int radius) {
		super(0,0);
		this.radius = radius;
	}
	
	//생성자 - 중심좌표와 반지름 초기화
	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
	
	//넓이 계산
	protected double calcArea() {
		return radius * radius * Math.PI;
	}
	
	//중심좌표 출력
	protected void printCenter() {
		System.out.print("원 ");
		super.printCenter();
	}
}
