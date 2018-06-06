package com.ry.exthread;

//i-- 与 system.out.println()的异常 println方法是同步的 但i-- 是在printiln之前执行的
public class Mythread extends Thread{
	private int i = 5;
	public void run(){
		System.out.println("i="+(i--)+" threadName = "+
	Thread.currentThread().getName());
	}
}
