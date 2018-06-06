package com.ry.z;

public class MyThread extends Thread{
	
	private int i;
	
	public MyThread(int i){
		super();
		this.i = i;
	}
	public void run(){
		System.out.println(i);
	}
}
