/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_Question
 * 1. 개요: 
 * 2. 작성일: 2015. 5. 11.
 * </pre>
 *
 * @author 신원준
 * @version 1.0
 */
public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer;
		
		System.out.println("가장 좋아하는 가수는?");
		answer = scanner.nextLine();
		if("빅뱅".equals(answer)) {
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! TT");
		}
		
		System.out.println("가장 좋아하는 배우는?");
		answer = scanner.nextLine();
		if("조인성".equals(answer)) {
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! TT");
		}
		
		System.out.println("가장 좋아하는 과목은?");
		answer = scanner.nextLine();
		if("자바".equals(answer)) {
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! TT");
		}
		
		scanner.close();
	}

}
