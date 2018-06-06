package com.ry.t8;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Run1 {
	public static void main(String[] args) {
		MyThread1 mythread = new MyThread1();
		
		System.out.println("begin ="+System.currentTimeMillis());
		mythread.start();
		System.out.println("end ="+System.currentTimeMillis());
	}
}
