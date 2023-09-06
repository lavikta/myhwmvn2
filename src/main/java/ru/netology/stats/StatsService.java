package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long amount = 0;
        for (long sale : sales) {
            amount += sale;
        }
        return amount;
    }

    public long average(long[] sales) {
        return sum(sales) / 12;
    }

    public int monthMax(long[] sales) {
        int monthResult = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthResult]) {
                monthResult = i;
            }
        }
        return monthResult + 1;
    }

    public int monthMin(long[] sales) {
        int monthResult = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthResult]) {
                monthResult = i;
            }
        }
        return monthResult + 1;

    }

    public int monthBelowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int monthAboveAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }
        }
        return counter;

    }
}
