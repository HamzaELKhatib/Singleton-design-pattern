package com.coffeepoweredcrew.singleton.src.eagersingleton;
/**
 * This class uses eager initialization of singleton instance.
 */
public class EagerSingleton {
	
	private EagerSingleton() {}

	private static final EagerSingleton INSTANCE = new EagerSingleton();
	
	public static EagerSingleton getInstance() {
		return INSTANCE;
	}
}