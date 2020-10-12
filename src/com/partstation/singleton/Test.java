package com.partstation.singleton;

public class Test {

	public static void main(String[] args) {

		Mgr02 mgr01 = Mgr02.getInstance();
		Mgr02 mgr02 = Mgr02.getInstance();
		System.out.println(mgr01 == mgr02);

	}

	public void testSingleton (Class<Mgr06> clazz) {

	}

}
