package ru.netology.stats;

public class StatsService {
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public float calculateAverage(int[] purchases) {
        float average = calculateSum(purchases) / 12.0F;
        return average;
    }

    public int findPeakMonth(int[] purchases) {

        int peak = purchases[0];
        int month = 0;
        int peakMonth = 0;

        for (int purchase : purchases) {
            month += 1;
            if (peak <= purchase) {
                peak = purchase;
                peakMonth = month;
            }
        }
        return peakMonth;
    }

    public int findMinMonth(int[] purchases) {

        int min = purchases[0];
        int month = 0;
        int minMonth = 0;

        for (int purchase : purchases) {
            month++;
            if (min >= purchase) {
                min = purchase;
                minMonth = month;
            }
        }
        return minMonth;
    }

    public int monthsUnderAverage(int[] purchases) {

        int monthsNumber = 0;
        float average = calculateAverage(purchases);
        for (int purchase : purchases) {
            if (purchase < average) {
                monthsNumber++;
            }
        }

        return monthsNumber;
    }

    public int monthsAboveAverage(int[] purchases) {

        int aboveMonthsNumber = 0;

        for (int purchase : purchases) {
            if (purchase > calculateAverage(purchases)) {
                aboveMonthsNumber = aboveMonthsNumber + 1;
            }
        }
        return aboveMonthsNumber;
    }
}
