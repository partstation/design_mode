package com.partstation.singleton;

public class Mgr05 {

	private static Mgr05 INSTANCE;

	private Mgr05() {}

	public static Mgr05 getInstance() {
		if (INSTANCE == null) {
			/*在Mgr04的基础上试图细化同步锁粒度以提高效率，但多个线程同样可以同时到达此地，
			 和Mgr03一样*/
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (Mgr05.class) {
				INSTANCE = new Mgr05();
			}
		}
		return INSTANCE;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(() -> {
				System.out.println(Mgr05.getInstance().hashCode());
			}).start();
		}
	}

}
