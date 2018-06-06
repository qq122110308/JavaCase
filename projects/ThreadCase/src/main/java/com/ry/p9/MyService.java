package com.ry.p9;

public class MyService {
	public MyOneList addServiceMethod(MyOneList list, String data){
		try {
			//这样写不会产生脏读
			synchronized (list) {
				if(list.getSize() < 1){
					Thread.sleep(2000);//模拟从远程花费2秒取回数据
					list.add(data);
				}
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return list;
	}
}
