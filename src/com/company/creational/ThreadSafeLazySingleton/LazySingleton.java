package com.company.creational.ThreadSafeLazySingleton;

public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton () {
        System.out.println("Lazy Singleton");
    }

    public static LazySingleton getInstance() {

        if(instance == null) {
            synchronized (LazySingleton.class){
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}
