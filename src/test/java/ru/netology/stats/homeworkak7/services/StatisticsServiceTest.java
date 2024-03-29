package ru.netology.stats.homeworkak7.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxAll() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {0, 5, 8, 4, 5, 3, 8, 6, 11, 8, 13};
        long expected = 13;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}
