/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_Race
 * 1. 개요: 
 * 2. 작성일: 2015. 11. 4.
 * </pre>
 *
 * @author 신원준
 * @version 1.0
 */
public class Race2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("main thread start");
		
		Thread r1 = new Thread(new Runner2("one"));
		Thread r2 = new Thread(new Runner2("two"));
		
		r1.start();
		r2.start();
		
		System.out.println("main thread end");
		
	}

}
