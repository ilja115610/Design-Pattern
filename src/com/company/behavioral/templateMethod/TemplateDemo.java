package com.company.behavioral.templateMethod;

import com.company.behavioral.templateMethod.template.PerformanceTestTemplate;

public class TemplateDemo {

    public static void main(String[] args) {

        PerformanceTestTemplate ptt = new PerformanceTest();

        ptt.run();
    }
}
