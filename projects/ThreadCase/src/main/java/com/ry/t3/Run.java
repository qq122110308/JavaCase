package com.ry.t3;

public class Run {
	//不共享数据
	public static void main(String[] args) {
		MyThread thread1 = new MyThread("A");
		MyThread thread2 = new MyThread("B");
		MyThread thread3 = new MyThread("C");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
