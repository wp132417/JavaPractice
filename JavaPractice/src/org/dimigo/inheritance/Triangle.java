/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_Triangle
 * 1. 개요: 삼각형 클래스
 * 2. 작성일: 2015. 8. 12.
 * </pre>
 *
 * @author 신원준
 * @version 1.0
 */
public class Triangle extends Figure {
	private int width;		//넓이
	private int height;		//높이
	
	//생성자 - 넓이와 높이 초기화(중심좌표는 0, 0)
	public Triangle(int width, int height) {
		super(0,0);
		this.width = width;
		this.height = height;
	}
	
	//생성자 - 중심좌표와 넓이와 높이 초기화
	public Triangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	//넓이 계산
	protected double calcArea() {
		return width * height * 0.5;
	}
	
	//중심좌표 출력
	protected void printCenter() {
		System.out.print("삼각형 ");
		super.printCenter();
	}
}
