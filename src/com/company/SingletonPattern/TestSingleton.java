package com.company.SingletonPattern;

public class TestSingleton {

    public static void main(String[] args) {

        PerformanceStage abc = PerformanceStage.getInstance();

        PerformanceStage bcd = PerformanceStage.getInstance();

        boolean t = abc == bcd;
        System.out.println(t);
    }
}
