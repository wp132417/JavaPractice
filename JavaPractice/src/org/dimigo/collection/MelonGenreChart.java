/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 * 	 |_MelonGenreChart
 * 1. 개요: 
 * 2. 작성일: 2015. 9. 24.
 * </pre>
 *
 * @author 신원준
 * @version 1.0
 */
public class MelonGenreChart {

	public static void main(String[] args) {
	
		Map<String, List<Music>> map = new HashMap<>();
		
		List<Music> balladList = new ArrayList<>();
		balladList.add(new Music("내 첫사랑", "베리굿"));
		balladList.add(new Music("또 다시 사랑", "임창정"));
		balladList.add(new Music("부산에 가면", "박진영"));
		
		List<Music> danceList = new ArrayList<>();
		danceList.add(new Music("커피", "유재환, 김예림"));
		danceList.add(new Music("다 잘될거야", "쿨"));
		
		map.put("발라드", balladList);
		map.put("댄스", danceList);
		
		printMap(map);
		
		balladList.set(2,  new Music("지우고 지워도", "차수경"));
		
		System.out.println("------- << 발라드 3위 곡 변경 >> -------");
		printMap(map);
		
		balladList.remove(0);
		
		System.out.println("------- << 발라드 1위 곡 삭제 >> -------");
		printMap(map);
		
		map.clear();
		
		System.out.println("------- << 전체 곡 삭제 >> -------");
		printMap(map);
		
		

	}
	
	public static void printMap(Map<String, List<Music>> map) {
		
		for(String key : map.keySet()) {
			System.out.println("[" + key + "]");
			for(Music m : map.get(key)) {
				System.out.println((map.get(key).indexOf(m)+1) + ". " + m);
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
	}

}
