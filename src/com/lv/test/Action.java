package com.lv.test;

public class Action {
    public synchronized static void say() {
    	System.out.println("invoke say");
    	try {
			Thread.sleep(5000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("hello i am saying!");
    }
    
    public synchronized static void sing() {
    	System.out.println("invoke sing");
    	try {
			Thread.sleep(5000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("i am singing");
    }
}
