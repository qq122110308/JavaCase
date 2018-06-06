package com.ry.t4_trhreadsafe;

public class BLogin extends Thread{
	public void run(){
		LoginServlet.doPost("b", "bb");
	}
}
