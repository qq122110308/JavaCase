package com.ry.userReturnInterrupt;

public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
