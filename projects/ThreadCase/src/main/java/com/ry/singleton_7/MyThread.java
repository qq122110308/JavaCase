package com.ry.singleton_7;

public class MyThread extends Thread{
	public void run(){
		System.out.println(MyObject.getInstance().hashCode());
	}
}
