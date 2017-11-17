package com.lv.test;

public class ThreadTest implements Runnable {
	
	@Override
	public void run() {
		Action.say();
	}
	
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		Thread t = new Thread(tt );
		t.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("start sing");
		Action.sing();
	}
}
