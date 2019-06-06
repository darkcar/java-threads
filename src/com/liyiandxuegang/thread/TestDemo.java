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
		// Start My Custom Thread
		mt.start();
		
		for(int i = 0; i < 20; i ++) {
			System.out.println("This is in main program	" + i);
		}
	}
}
