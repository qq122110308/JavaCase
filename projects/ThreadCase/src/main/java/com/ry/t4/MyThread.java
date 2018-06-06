package com.ry.t4;

public class MyThread extends Thread{
	private int count = 5;
	//synchronized 加锁的 代码 叫  互斥区 或者是 临界区
	synchronized public void run(){
		super.run();
		count-- ;
		System.out.println("由"+this.currentThread().getName()
				+",计算count="+count);
	}
}
