package com.singleton;

/**
 * 饿汉模式
 * 
 * @author Administrator
 * 
 */
public class HSingleton {
	private static HSingleton Hsingleton;

	private HSingleton() {

	}

	public static class HsingletonHelp {
		private static final HSingleton INSTANCE = new HSingleton();
	}

	public HSingleton getInstance() {
		Hsingleton = HsingletonHelp.INSTANCE;
		return Hsingleton;
	}

	public HSingleton test() {
		return Hsingleton;
	}
}
