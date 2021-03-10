package com.company.structural.decorator2;

import java.util.List;

public interface StatisticsLogger {

    void displayStatistics();

    List<Double> getExecutionTimes();
}
