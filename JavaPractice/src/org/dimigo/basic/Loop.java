package org.dimigo.basic;

/*
 *  << 다섯번째 수행평가 과제 >>
 * 내용: *, 숫자 출력
 * 작성일자: 2015/3/17
 * @author 신원준
 * @version 1.0
 */

public class Loop {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if(i == j) {
					System.out.print("*");
					continue;
				}
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
