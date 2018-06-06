package com.ry.synStaticMethod;

public class ThreadB extends Thread{
	public void run(){
		Service.printB();
	}
}
