package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void salesNumberSum (){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        long actual = service.salesNumberSum(sales);
        assertEquals(expected ,actual);
    }

    @Test
    void averageSalesSum(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        long actual = service.averageSalesSum(sales);
        assertEquals(expected ,actual);
    }

    @Test
    void minSalesNumber() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        long actual = service.minSalesNumber(sales);

        assertEquals(expected, actual);
    }

    @Test
    void maxSalesNumber() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        long actual = service.maxSalesNumber(sales);

        assertEquals(expected, actual);
    }

    @Test
    void moreThenAverageMonthSales(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        long actual = service.moreThenAverageMonthSales(sales);
        assertEquals(expected ,actual);
    }

    @Test
    void lessThenAverageMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        long actual = service.lessThenAverageMonthSales(sales);
        assertEquals(expected, actual);
    }
}