/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_FamilyMember
 * 1. 개요: 가족멤버 클래스
 * 2. 작성일: 2015. 6. 15.
 * </pre>
 *
 * @author 신원준
 * @version 1.0
 */
public class FamilyMember {
	//정적 필드
	private static int memberCnt;
	//인스턴스 필드
	private String memberName;
	
	//생성자
	public FamilyMember(String memberName) {
		this.memberName = memberName;
		memberCnt++;
	}
	
	//정적 메소드
	public static void printMemberCnt() {
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");
	}
	
	//인스턴스 메소드
	public String getMemberName() {
		return this.memberName;
	}
}
