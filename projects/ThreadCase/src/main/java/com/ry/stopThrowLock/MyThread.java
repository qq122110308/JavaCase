package com.ry.stopThrowLock;

public class MyThread extends Thread{
	private SynchronizedObject object;
	
	public MyThread(SynchronizedObject object){
		super();
		this.object = object;
	}
	
	public void run(){
		object.printString("b", "bb");
	}
}
