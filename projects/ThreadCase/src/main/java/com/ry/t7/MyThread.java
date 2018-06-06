package com.ry.t7;

//isAlive()的功能是判断当前的线程是否处于活跃状态
public class MyThread extends Thread{
	public void run(){
		System.out.println("run="+this.isAlive());
	}
}
