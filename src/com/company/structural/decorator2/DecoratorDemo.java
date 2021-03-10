package com.company.structural.decorator2;

import java.util.List;

public class DecoratorDemo {

    public static void main(String[] args) {
        final StatisticsLogger statisticsLogger =
                      new WithSummaryStatisticsLogger(
                              new WithMeanStatisticsLogger(
                                      new ExecutionTimesBaseStatistics(List.of(1.2, 2.2, 3.4))));

        statisticsLogger.displayStatistics();
    }
}
