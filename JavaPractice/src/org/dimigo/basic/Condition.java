package org.dimigo.basic;
/*
 *  << 네번째 수행평가 과제 >>
 * 내용: 고속도로 통행료 출력
 * 작성일자: 2015/3/23
 * @author 신원준
 * @version 1.0
 */
public class Condition {

	public static void main(String[] args) {
		int fee, additional_fee;
		int distance = 10;
		String car = "고속버스";
		switch(car) {
		case "고속버스":
			fee = 850;
			additional_fee = 300;
			break;
		case "경차":
			fee = 300;
			additional_fee = 200;
			break;
		default:
			fee = 600;
			additional_fee = 200;
		}
		
		if(distance % 10 == 0) {
			fee += additional_fee * ((distance / 10) - 1);
		} else {
			fee += additional_fee * (distance / 10);
		}
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("차 종류 : " + car);
		System.out.println("거리 : " + distance + "km");
		System.out.println("요금 : " + fee + "원");
	}

}
