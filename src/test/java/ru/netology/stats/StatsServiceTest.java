package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void salesNumberSum() {
        StatsService StatsService = new StatsService();
        int[] salesNumbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = StatsService.salesNumberSum(salesNumbers);
        int expected = 180;

        assertEquals(expected,actual);

    }

    @Test
    void averageSalesSum() {
        StatsService StatsService = new StatsService();
        int[] salesNumbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = StatsService.averageSalesSum(salesNumbers);
        int expected = 15;

        assertEquals(expected, actual);

    }

    @Test
    void maxSalesNumber() {
        StatsService StatsService = new StatsService();
        int[] salesNumbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = StatsService.maxSalesNumber(salesNumbers);
        int expected = 8;

        assertEquals(expected, actual);
    }
    @Test
    void minSalesNumber() {
        StatsService StatsService = new StatsService();
        int[] salesNumbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = StatsService.minSalesNumber(salesNumbers);
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void lessThenAverageMonth() {
        StatsService StatsService = new StatsService();
        int[] salesNumbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = StatsService.lessThenAverageMonthSales(salesNumbers);
        int expected = 7;

        assertEquals(expected, actual);
    }
    @Test
    void moreThenAverageMonth() {
        StatsService StatsService = new StatsService();
        int[] salesNumbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = StatsService.moreThenAverageMonthSales(salesNumbers);
        int expected = 7;

        assertEquals(expected, actual);
    }
}