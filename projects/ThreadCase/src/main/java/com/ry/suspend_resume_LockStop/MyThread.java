package com.ry.suspend_resume_LockStop;

public class MyThread extends Thread{
	private long i = 0;
	
	public void run(){
		while(true){
			i++;
			System.out.println(i);
		}
	}
}
