package com.ry.z3_ok;

public class ThreadA extends Thread{
	private MyService service;
	public ThreadA(MyService service){
		super();
		this.service = service;
	}
	
	public void run(){
		service.waitMethod();
	}
	
}
