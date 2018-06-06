package com.ry.synStaticMethod;

public class Run {
	public static void main(String[] args) {
		ThreadA thread1 = new ThreadA();
		thread1.setName("A");
		thread1.start();
		ThreadB thread2 = new ThreadB();
		thread2.setName("B");
		thread2.start();
	}
}
