/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * 	 |_Runner
 * 1. 개요: 
 * 2. 작성일: 2015. 11. 4.
 * </pre>
 *
 * @author 신원준
 * @version 1.0
 */
public class Runner extends Thread {
	
	String name;
	
	public Runner() {
	}
	
	public Runner(String name) {
		this.name = name;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		System.out.println(name + " 출발");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for(int i=100; i>=0; i-=10) {
			System.out.println(name + " " + i + " 미터");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(name + " 골인");
		
	}
	
}
