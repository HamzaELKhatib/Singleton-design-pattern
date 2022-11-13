package com.coffeepoweredcrew.singleton.src.lazysingleton;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization.
 */
public class LazySingleton {

	private LazySingleton() {}
	
	private static class RegistryHolder {
		static LazySingleton INSTANACE = new LazySingleton();
	}
	
	public static LazySingleton getInstance() {
		return RegistryHolder.INSTANACE;
	}
}
