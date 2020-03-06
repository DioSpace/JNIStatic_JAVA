package com.my;

public class Register {
	//在src目录下 进行编译 javah -classpath . -jni com.my.Register
	native String helloworld();
	
	static {
		System.load("F:/eclipse/JavaJniStatic/src/libs/staticlib.dll");
	}
	
	public static void main(String[] args) {
		Register register = new Register();
		System.out.println("static value:"+ register.helloworld());
	}
}
