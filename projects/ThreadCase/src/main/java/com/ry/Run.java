package com.ry;

public class Run {
	//线程调用的随机性
	public static void main(String[] args) {
		MyThread myThread = new MyThread(); 
		myThread.start();
		System.out.println("运行结束！");
	}
}
