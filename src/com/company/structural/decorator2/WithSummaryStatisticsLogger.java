package com.company.structural.decorator2;

import java.util.List;

public class WithSummaryStatisticsLogger implements StatisticsLogger{

    private StatisticsLogger logger;

    public WithSummaryStatisticsLogger(StatisticsLogger logger) {
        this.logger = logger;
    }

    @Override
    public void displayStatistics() {

        System.out.printf("Number of elements: %s%nSum: %f%nMin: %f%n",getExecutionTimes().size()
                ,getExecutionTimes().stream().mapToDouble(x->x).sum()
                ,getExecutionTimes().stream().mapToDouble(x->x).min().orElse(0.0));

        logger.displayStatistics();

    }

    @Override
    public List<Double> getExecutionTimes() {
        return logger.getExecutionTimes();
    }
}
