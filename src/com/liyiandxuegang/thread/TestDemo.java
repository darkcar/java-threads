package com.liyiandxuegang.thread;

/**
 * Start Thread: 
 *  1) Create Class extends Thread
 *  2) Rewrite run method. 
 *  3) Create An instance of the class
 *  4) Call the start method 
 * @author xwang
 *
 */
public class TestDemo {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("-----Main Thread------");
		// Create Thread Instance
		MyThread mt = new MyThread("Mt - Created Thread");
		MyThread mt2 = new MyThread("Mt2 - Created Thread");
		System.out.println("mt state: " + mt.getState());
		// Start My Custom Thread
		mt.run();
		
		mt2.run();
		mt.start();
		System.out.println("mt state: " + mt.getState());
		for(int i = 0; i < 20; i ++) {
			System.out.println("This is in main program	" + i);
		}
		
		Thread.sleep(5000);
		System.out.println("mt state: " + mt.getState());
	}
}
