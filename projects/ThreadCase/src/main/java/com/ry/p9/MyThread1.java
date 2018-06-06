package com.ry.p9;

public class MyThread1 extends Thread{
	private MyOneList list;
	public MyThread1(MyOneList list){
		super();
		this.list = list;
	}
	
	public void run(){
		MyService msRef = new MyService();
		msRef.addServiceMethod(list, "A");
	}
}
