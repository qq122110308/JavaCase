package com.ry.p9;

import java.util.ArrayList;
import java.util.List;


public class MyOneList {
	private List  list = (List) new ArrayList();
	
	synchronized public void add(String data){
		list.add(data);
	}
	
	synchronized public int getSize(){
		return list.size();
	}
}
