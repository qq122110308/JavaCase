package com.ry.innerClass;

import com.ry.innerClass.PublicClass.PrivateClass;

public class Run {
	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();
		publicClass.setUsername("usernamevalue");
		publicClass.setPassword("passwordvalue");
		System.out.println(publicClass.getUsername()+" "+publicClass.getPassword());
		
		PrivateClass privateClass = publicClass.new PrivateClass();
		privateClass.setAddress("addressValue");
		privateClass.setAge("ageValue");
		System.out.println(privateClass.getAge()+" "+privateClass.getAddress());
	}
}
