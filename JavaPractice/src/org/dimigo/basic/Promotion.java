package org.dimigo.basic;

/*
 *  << 두번째 수행평가 과제 >>
 * 내용: 디미베네 연간 인건비 출력
 * 작성일자: 2015/3/17
 * @author 신원준
 * @version 1.0
 */
public class Promotion {

	public static void main(String[] args) {
		
		int salary = 1700000;
		int staff = 3;
		int store_num = 1500;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", salary) + "원");
		System.out.println("점포 내 직원 수 : " + staff + "명");
		System.out.println("점포 수 : " + String.format("%,d",store_num) + "개");
		
		long salary_of_year = (long) salary * 12 * staff * store_num;
		System.out.println("\n연간 인건비 : " + String.format("%,d", salary_of_year) + "원");
	}

}
