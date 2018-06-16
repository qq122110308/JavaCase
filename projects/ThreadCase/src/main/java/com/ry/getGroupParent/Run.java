package com.ry.getGroupParent;

public class Run {
	public static void main(String[] args) {
		System.out.println("线程:"+Thread.currentThread().getName()+" 所在的线程组名为:"
	+Thread.currentThread().getThreadGroup().getName());
		
		System.out.println("线程:"+Thread.currentThread().getName()+" 所在的线程组名为:"
				+Thread.currentThread().getThreadGroup().getParent().getName());
		
		System.out.println("线程:"+Thread.currentThread().getName()+" 所在的线程组名为:"
				+Thread.currentThread().getThreadGroup().getParent().getParent().getName());
	}
}
