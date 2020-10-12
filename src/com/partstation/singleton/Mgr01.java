package com.partstation.singleton;

/**
 * 使用static修饰，类被加载时只实例化一次，JVM保证线程安全
 */

public class Mgr01 {

	private static final Mgr01 INSTANCE = new Mgr01();

	private Mgr01(){}

	public static Mgr01 getInstance() {
		return INSTANCE;
	}

}
