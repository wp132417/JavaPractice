package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int tz_a = 9;
		int tz_b = 10;
		double tz_h = 5.8;
		
		double trapezoid_s = (tz_a + tz_b) * tz_h / 2;
		
		int plg_a = 9;
		double plg_h = 5.4;
		
		double parallelogram_s = plg_a * plg_h;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + trapezoid_s);
		System.out.println("평행사변형 넓이 : " + parallelogram_s);
		
		if(trapezoid_s > parallelogram_s) {
			System.out.println("사다리꼴이 평행사변형 보다 " + (trapezoid_s - parallelogram_s) + " 큽니다.");
		} else {
			if(trapezoid_s == parallelogram_s) {
				System.out.println("사다리꼴과 평행사변형의 넓이가 같습니다.");
			} else {
				System.out.println("평행사변형이 사다리꼴 보다 " + (parallelogram_s - trapezoid_s) + "큽니다.");
			}
		}
	}

}
