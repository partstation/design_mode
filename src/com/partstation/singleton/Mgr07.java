package com.partstation.singleton;

/**
 * 静态内部类
 * JVM保证单例：类的静态成员在生命周期内只会加载一次
 * 加载外部类时不会加载内部类，这样可以实现懒加载的功能
 */
public class Mgr07 {

	private Mgr07() {}

	private static class Mgr07Holder {
		private final static Mgr07 INSTANCE = new Mgr07();
	}

	public static Mgr07 getInstance() {
		return Mgr07Holder.INSTANCE;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(() -> {
				System.out.println(Mgr07.getInstance().hashCode());
			}).start();
		}
	}

}
