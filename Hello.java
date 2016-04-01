package com.sap.sakp.lili.lab;

public class Hello {

	public static void main(String[] args) {
		saySomething("hello, world!");

	}
	
	public static void saySomething(String say) {
		for (int i=0; i<3; i++) {
			System.out.println(say);
		}
	}

}
