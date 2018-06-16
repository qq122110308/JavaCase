package com.ry.readWriteLockBegin3;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	public void read(){
		try {
			try {
				lock.readLock().lock();
				System.out.println("获得读锁"+Thread.currentThread().getName()
						+" "+System.currentTimeMillis());
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				lock.readLock().unlock();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void write(){
		try {
			try {
				lock.writeLock().lock();
				System.out.println("获得写锁"+Thread.currentThread().getName()
						+" "+System.currentTimeMillis());
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				lock.writeLock().unlock();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
