package com.my;

public class Register {
	//��srcĿ¼�� ���б��� javah -classpath . -jni com.my.Register
	native String helloworld();
	
	static {
		System.load("F:/eclipse/JavaJniStatic/src/libs/staticlib.dll");
	}
	
	public static void main(String[] args) {
		Register register = new Register();
		System.out.println("static value:"+ register.helloworld());
	}
}
