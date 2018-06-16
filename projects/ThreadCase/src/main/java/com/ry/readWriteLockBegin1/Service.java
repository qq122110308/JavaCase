package com.ry.readWriteLockBegin1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	public void read(){
		try {
			try {
				lock.readLock().lock();
				System.out.println("获得读锁"+Thread.currentThread().getName()
						+" "+System.currentTimeMillis());
				Thread.sleep(100000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				lock.readLock().unlock();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
