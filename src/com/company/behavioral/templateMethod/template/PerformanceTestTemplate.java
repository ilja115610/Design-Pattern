package com.company.behavioral.templateMethod.template;

public abstract class PerformanceTestTemplate {

    protected abstract void testIteration();

    protected abstract int getWarmupIterationsNum();

    protected abstract int getIterationsNum();

    public void run() {

        getWarmupIterationsNum();

        long time = 0L;

        for(int i = 0; i < getIterationsNum(); i++) {
            Long before = System.currentTimeMillis();

            testIteration();

            Long after = System.currentTimeMillis();

            time+=(after-before);

            getIterationsNum();
        }


        System.out.println((time)/getIterationsNum());
    }
}
