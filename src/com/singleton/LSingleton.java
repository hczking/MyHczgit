package com.singleton;

/**
 * 懒汉模式
 *
 * @author Administrator
 *
 */
public class LSingleton {
	private static LSingleton lSingleton;
	private LSingleton(){
		
	}
	public static synchronized LSingleton getInstance(){
		if(lSingleton==null){
			lSingleton=new LSingleton();
		}
		return lSingleton;
	}
}
