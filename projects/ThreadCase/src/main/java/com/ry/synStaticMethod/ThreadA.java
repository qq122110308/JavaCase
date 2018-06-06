package com.ry.synStaticMethod;

public class ThreadA extends Thread{
	public void run(){
		Service.printA();
	}
}
