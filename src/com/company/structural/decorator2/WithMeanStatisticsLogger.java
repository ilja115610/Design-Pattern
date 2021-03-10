package com.company.structural.decorator2;

import java.util.List;

public class WithMeanStatisticsLogger implements StatisticsLogger{

   private StatisticsLogger logger;

    public WithMeanStatisticsLogger(StatisticsLogger logger) {
        this.logger = logger;
    }

    @Override
    public void displayStatistics() {

        System.out.println("Average: "+logger.getExecutionTimes().stream().mapToDouble(x->x).average().orElse(0.0));
        logger.displayStatistics();

    }

    @Override
    public List<Double> getExecutionTimes() {
        return logger.getExecutionTimes();
    }
}
