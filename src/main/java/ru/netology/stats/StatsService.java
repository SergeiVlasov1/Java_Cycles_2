package ru.netology.stats;

public class StatsService {
    int[] salesNumbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int salesSum = 0;

    public int salesNumberSum(int[] salesNumbers) {
        for (int salesNumber : salesNumbers) {
            salesSum += salesNumber;
        }
        return salesSum;
    }

    public int averageSalesSum(int[] salesNumbers) {
        int averageSum = 0;
        for (int salesNumber : salesNumbers) {
        }
        averageSum = salesNumberSum(salesNumbers) / salesNumbers.length;

        return averageSum;
    }

    public int maxSalesNumber(int[] salesNumbers) {
        int maxSalesNumberMonth = 0;
        int monthNumber = 0;
        for (int salesNumber : salesNumbers) {
            if (salesNumber >= salesNumbers[maxSalesNumberMonth]) {
                maxSalesNumberMonth = monthNumber;
            }
            monthNumber = monthNumber + 1;
        }
        return maxSalesNumberMonth + 1;
    }


    public int minSalesNumber(int[] salesNumbers) {
        int minSalesNumberMonth = 0;
        int minmonthNumber = 0;
        for (int salesNumber : salesNumbers) {
            if (salesNumber <= salesNumbers[minSalesNumberMonth]) {
                minSalesNumberMonth = minmonthNumber;
            }
            minmonthNumber = minmonthNumber + 1;
        }
        return minSalesNumberMonth + 1;
    }

    public int lessThenAverageMonthSales(int[] salesNumbers) {
        int lessAverageMonth = 0;
        float average = averageSalesSum(salesNumbers);
        for (int salesNumber : salesNumbers) {
            if (salesNumber <= average) {
                lessAverageMonth++;
            }
        }
        return lessAverageMonth;
    }

    public int moreThenAverageMonthSales(int[] salesNumbers) {
        int moreAverageMonth = 0;
        float average = averageSalesSum(salesNumbers);
        for (int salesNumber : salesNumbers) {
            if (salesNumber >= average) {
                moreAverageMonth++;
            }
        }
        return moreAverageMonth;
    }
}