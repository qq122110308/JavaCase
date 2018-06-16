package com.ry.singleton_7;
//静态内部类实现单例模式
public class MyObject {
	
	private static class MyObjectHandler{
		private static MyObject myObject = new MyObject();
	}
	
	private MyObject(){
		
	}
	
	public static MyObject getInstance(){
		return MyObjectHandler.myObject;
	}
	
}
