package com.partstation.singleton;

public class Mgr06 {

	private static volatile Mgr06 INSTANCE;

	private Mgr06() {}

	public static Mgr06 getInstance() {
		//外层的判空可以提高效率
		if (INSTANCE == null) {
			/*鉴于Mgr05的错误，在同步代码块中再次检查，保证在没有实例的情况下再新建对象
			可以提高效率*/
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (Mgr06.class) {
				if (INSTANCE == null) {
					INSTANCE = new Mgr06();
				}
			}
		}
		return INSTANCE;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(() -> {
				System.out.println(Mgr06.getInstance().hashCode());
			}).start();
		}
	}
}
