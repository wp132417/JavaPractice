/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_idolGroup
 * 1. 개요: 아이돌 그룹명, 멤버 출력
 * 2. 작성일: 2015. 6. 1.
 * </pre>
 *
 * @author 신원준
 * @version 1.0
 */
public class idolGroup {

	public static void main(String[] args) {
		//아이돌 그룹명
		String[] idolGroup = {"빅뱅", "2NE1", "걸스데이"};
		//아이돌 그룹 멤버
		String[][] members = {
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유라", "혜리", "소진", "민아"}
		};
		//출력
		for(int i=0;i<idolGroup.length;i++) {
			System.out.println("<<" + idolGroup[i]+ "멤버 >>");
			for(int j=0;j<members[i].length;j++) {
				System.out.println(members[i][j]);
			}
			System.out.println();
		}
	}

}
