package org.dimigo.basic;

public class Condition {
	public static void main(String[] args) {
		int fee, additional_fee;
		int distance = 21;
		String car = "경차";
		
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
		
		if(distance != 0 && distance % 10 == 0) {
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