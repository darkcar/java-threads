package com.liyiandxuegang.thread;

public class TestDemo2 {
	
	public static void main(String[] args) {
		System.out.println("This is Main Thread: ");
		MyRunnable myRunnable = new MyRunnable();
		// Create Thread
		Thread thd1 = new Thread(myRunnable, "MyRun#1");
		Thread thd2 = new Thread(myRunnable, "MyRun#2");
		
		thd1.start();
		thd2.start();
	}
}
