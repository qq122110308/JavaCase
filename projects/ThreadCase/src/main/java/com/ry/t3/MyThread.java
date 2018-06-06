package com.ry.t3;

//实例变量与线程安全
//自定义线程类中的实例变量针对其他线程可以有共享与不共享之分 
public class MyThread extends Thread{
	private int count = 5;
	
	public MyThread(String name){
		super();
		this.setName(name);//设置线程名称
	}
	
	public void run(){
		super.run();
		while(count > 0){
			count--;
			System.out.println("由"+this.currentThread().getName()
					+" 计算,count="+count);
		}
	}
}
