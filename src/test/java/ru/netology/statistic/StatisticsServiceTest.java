package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMax2() {
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();

        long[] incomesInBillions = {3, 0, 5, 7, 4, 5, 3, 8, 6, 16, 1, 26};
        long expected = 26;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMax3() {
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();

        long[] incomesInBillions = {9, 10, 15, 17, 4, 5, 3, 8, 6, 16, 1, 3};
        long expected = 17;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}