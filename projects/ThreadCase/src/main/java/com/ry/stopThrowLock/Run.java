package com.ry.stopThrowLock;

public class Run {
	public static void main(String[] args) {
		try {
			SynchronizedObject object = new SynchronizedObject();
			MyThread thread = new MyThread(object);
			thread.start();
			Thread.sleep(3000);
			thread.stop();
			System.out.println(object.getUsername()+" "+object.getPassword());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
