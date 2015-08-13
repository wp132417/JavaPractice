/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_FigureTest
 * 1. 개요: Figure, Circle, Triangle, Rectangle 클래스 테스트
 * 2. 작성일: 2015. 8. 12.
 * </pre>
 *
 * @author 신원준
 * @version 1.0
 */
public class FigureTest {

	public static void main(String[] args) {
		//도형 객체 생성
		Circle c = new Circle(5);
		Triangle t = new Triangle(10, 10, 5, 8);
		Rectangle r = new Rectangle(20, 20, 5, 8);
		
		//도형 넓이 출력
		System.out.println("원의 넓이 : " + String.format("%.1f", c.calcArea()));
		System.out.println("삼각형의 넓이 : " + t.calcArea());
		System.out.println("사각형의 넓이 : " + r.calcArea());
		System.out.println();
		
		//중심좌표 출력
		c.printCenter();
		t.printCenter();
		r.printCenter();
		System.out.println();
		
		System.out.println("--중심좌표 이동(x, y축 5씩)");
		System.out.println();
		
		//중심좌표 이동
		c.moveFigure(5, 5);
		t.moveFigure(5, 5);
		r.moveFigure(5, 5);

		//중심좌표 출력
		c.printCenter();
		t.printCenter();
		r.printCenter();
	}

}
