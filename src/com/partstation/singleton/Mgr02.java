package com.partstation.singleton;

public class Mgr02 {

	private static final Mgr02 INSTANCE;

	static {
		INSTANCE = new Mgr02();
	}

	private Mgr02() {}

	public static Mgr02 getInstance() {
		return INSTANCE;
	}

}
