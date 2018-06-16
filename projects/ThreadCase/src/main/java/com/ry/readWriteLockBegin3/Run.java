package com.ry.readWriteLockBegin3;

//这个例子说明读写是互斥的 ,同样写读也是互斥的
public class Run {
	/*public static void main(String[] args) {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		ThreadB b = new ThreadB(service);
		b.setName("B");
		a.start();
		b.start();
	}*/
	
	public static void main(String[] args) {
		Service service = new Service();
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
	}
}
