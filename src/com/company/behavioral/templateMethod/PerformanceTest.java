package com.company.behavioral.templateMethod;

import com.company.behavioral.templateMethod.template.PerformanceTestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PerformanceTest extends PerformanceTestTemplate {


    @Override
    protected void testIteration() {

        List<Long> list = new ArrayList<>();
        for(int i = 0; i<10000; i++){
            list.add(new Random().nextLong());
        }
        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = i + 1; j < list.size(); j++) {
                        if(list.get(j)< list.get(i)){
                            long temp = list.get(i);
                            list.set(i,list.get(j));
                            list.set(j,temp);
                            sorted = false;
                        }
                }
            }
        }
    }

    @Override
    protected int getWarmupIterationsNum() {

        for(int i = 0; i<3; i++){
            testIteration();
        }
        return 3;
    }

    @Override
    protected int getIterationsNum() {

        return 10;
    }

    @Override
    public void run() {
        super.run();
    }
}
