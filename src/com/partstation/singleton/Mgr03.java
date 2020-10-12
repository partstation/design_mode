package com.partstation.singleton;

/**
 * 线程不安全
 */
public class Mgr03 {

	private static Mgr03 INSTANCE;

	private Mgr03() {}

	public static Mgr03 getInstance() {
		if (INSTANCE == null) {
			//多个线程可能同时进入这一步，导致多个线程都判断实例为空，进而new出新对象
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			INSTANCE = new Mgr03();
		}
		return INSTANCE;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(() -> {
				System.out.println(Mgr03.getInstance().hashCode());
			}).start();
		}
	}
}
