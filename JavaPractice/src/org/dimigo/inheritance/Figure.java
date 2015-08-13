/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_Figure
 * 1. 개요: 
 * 2. 작성일: 2015. 8. 12.
 * </pre>
 *
 * @author 신원준
 * @version 1.0
 */
public class Figure {
	//중심좌표 필드
	private int centerX;
	private int centerY;
	
	//생성자 - 중심좌표 초기화
	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	//넓이 계산
	protected double calcArea() {
		return 0.0;
	}
	
	//중심좌표 출력
	protected void printCenter() {
		System.out.println("중심좌표 : (" + centerX + ", " + centerY + ")");
	}
	
	//중심좌표 이동
	protected void moveFigure(int x, int y) {
		centerX += x;
		centerY += y;
	}
	
}
