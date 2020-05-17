package com.singleton;

import java.util.Date;

public class Test extends Date {
	public static void main(String[] args) {
		// System.out.println("HSingleton.test()---->"+HSingleton.test());
		// System.out.println("HSingleton.getInstance()---->"+HSingleton.getInstance());
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		operator(a, b);
		System.out.println(a + "\t" + b);
		new Test().test();
	}
	public void test(){
		System.out.println(getClass().getSuperclass().getName());
	}
	static void operator(StringBuffer x, StringBuffer y) {
		x = x.append(y);
		y = x;
	}

}
