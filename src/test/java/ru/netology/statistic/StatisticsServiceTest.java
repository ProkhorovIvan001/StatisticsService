package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @org.junit.jupiter.api.Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void findMaxWhenMaximumIsAtTheEnd() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 2, 3};
        long expected = 3;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}