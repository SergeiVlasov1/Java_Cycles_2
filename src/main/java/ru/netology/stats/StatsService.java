package ru.netology.stats;

public class StatsService {
    public int salesNumberSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSalesSum(long[] sales) {
        return salesNumberSum(sales) / sales.length;
    }

    public int maxSalesNumber(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSalesNumber(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lessThenAverageMonthSales(long[] sales) {
        long month = 0;
        for (long sale : sales) {

            if (sale < averageSalesSum(sales)) {
                month = month + 1;
            }
        }
        return (int) month;
    }


    public int moreThenAverageMonthSales(long[] sales) {
        long month = 0;
        for (long sale : sales) {

            if (sale > averageSalesSum(sales)) {
                month = month + 1;
            }
        }
        return (int) month;
    }




}