package com.ry.timerTest1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//进程未销毁  因为创建一个Timer 是一个线程,而不是守护线程,它一直在运行
public class Run1 {
	private static Timer timer = new Timer();
	
	static public class MyTask extends TimerTask{
		public void run(){
			System.out.println("运行了!时间为："+new Date());
		}
	}
	
	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String dataString = "2018-06-14 11:05:00";
			Date dateRef = sdf.parse(dataString);
			System.out.println("字符串时间为："+dateRef.toLocaleString()+" 当前时间为:"+new Date().toLocaleString());
			timer.schedule(task, dateRef);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	 
}
