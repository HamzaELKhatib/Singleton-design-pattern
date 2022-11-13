package com.coffeepoweredcrew.singleton.src.threadsafesingleton;

/**
 * This class demonstrates singleton pattern using Double Checked Locking or "classic" singleton.
 * This is also a lazy initializing singleton.
 * Although this implementation solves the multi-threading issue with lazy initialization using volatile
 * and double check locking, the volatile keyword is guaranteed to work only after JVMs starting with
 * version 1.5 and later.
 */
public class ThreadSafeSingleton {

    private ThreadSafeSingleton() {}
    
    private static volatile ThreadSafeSingleton INSTANCE;
    
    public static ThreadSafeSingleton getInstance() {
    	if(INSTANCE == null) {
    		synchronized (ThreadSafeSingleton.class) {
				if(INSTANCE == null) {
					INSTANCE = new ThreadSafeSingleton();
				}
			}
    	}
    	return INSTANCE;
    }
}
