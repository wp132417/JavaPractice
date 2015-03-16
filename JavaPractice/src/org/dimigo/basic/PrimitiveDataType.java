package org.dimigo.basic;

/**
 * << 첫번째 수행평가 과제 >>
 * 내용: 아이유 프로필 출력하기
 * 작성일자: 2015/3/13
 * @author 신원준
 * @version 1.0
 */
public class PrimitiveDataType {
	
	public static void main(String[] args) {
		String name = "아이유";
		boolean isMale = false;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		
		System.out.println("<< " + name + " 프로필 >>");
		System.out.println("이름: " + name);
		System.out.print("성별: ");
		
		if (isMale) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		
		System.out.println("나이: " + age + "세");
		System.out.println("키: " + height + "cm");
		System.out.println("몸무게: " + weight + "kg");
		System.out.print("혈액형: " + bloodType + "형");
	}
}
//코드 수정ㅁㄴㅇㄹㅁㄴㅇ