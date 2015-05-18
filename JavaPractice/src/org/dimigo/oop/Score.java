/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_Score
 * 1. 개요: String builder를 사용하여 점수 출
 * 2. 작성일: 2015. 5. 12.
 * </pre>
 *
 * @author 신원준
 * @version 1.0
 */
public class Score {

	public static void main(String[] args) {
		int kor, math, eng;
		StringBuilder score = new StringBuilder("<<점수 출력>>\n");
		Scanner scanner = new Scanner(System.in);
		
		// 점수 입력
		System.out.print("국어 점수 입력 => ");
		kor = scanner.nextInt();
		System.out.print("수학 점수 입력 => ");
		math = scanner.nextInt();
		System.out.print("영어 점수 입력 => ");
		eng = scanner.nextInt();
		
		int sum = kor + math + eng;
		
		//String builder에 String 넣기
		score.append("국어 점수: ").append(kor).append("점\n")
			.append("수학 점수: ").append(math).append("점\n")
			.append("영어 점수: ").append(eng).append("점\n")
			.append("총점: ").append(sum).append("점\n")
			.append("평균: ").append(String.format("%.1f", sum/3.0)).append("점\n");
		//출력
		System.out.println(score);
		scanner.close();
	}

}
