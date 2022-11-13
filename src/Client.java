package com.coffeepoweredcrew.singleton.src;

import com.coffeepoweredcrew.singleton.src.eagersingleton.EagerSingleton;
import com.coffeepoweredcrew.singleton.src.enumsingleton.EnumSingleton;
import com.coffeepoweredcrew.singleton.src.lazysingleton.LazySingleton;
import com.coffeepoweredcrew.singleton.src.threadsafesingleton.ThreadSafeSingleton;

public class Client {

	public static void main(String[] args) {


		// EagerSingleton
		EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();

		EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();

		System.out.println("EagerSingleton comparison of 2 instances: " + (eagerSingleton1 == eagerSingleton2));

		//====================================================================================================

		// LazySingleton
		LazySingleton lazySingleton1 = LazySingleton.getInstance();

		LazySingleton lazySingleton2 = LazySingleton.getInstance();

		System.out.println("LazySingleton comparison: of 2 instances" + (lazySingleton1 == lazySingleton2));

		//====================================================================================================

		// ThreadSafeSingleton
		ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();

		ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();

		System.out.println("ThreadSafeSingleton comparison of 2 instances: " + (threadSafeSingleton1 == threadSafeSingleton2));

		//====================================================================================================

		// EnumSingleton
		EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;

		EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;

		System.out.println("EnumSingleton comparison of 2 instances: " + (enumSingleton1 == enumSingleton2));

	}

}
