package com.company.creational.ThreadSafeSingletonBP;

public class ThreadSafeSingleton {


    private ThreadSafeSingleton(){

    }

    private static class HelperInner {

        private static final ThreadSafeSingleton INSTANCE = new ThreadSafeSingleton();


        public static ThreadSafeSingleton getInstance() {
            return HelperInner.INSTANCE;
        }

    }

}
