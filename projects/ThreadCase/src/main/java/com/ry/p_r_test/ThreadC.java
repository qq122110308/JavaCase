package com.ry.p_r_test;

public class ThreadC extends Thread{
	private C c ;
	public ThreadC(C c){
		super();
		this.c = c;
	}
	
	public void run(){
		while(true){
			c.getValue();
		}
	}
}
