package ru.netology.stats;

public class StatsService<i> {
    public int calculateMonth(int[] sales) {
        int month = 0;
        for (int sale : sales) {
            month = month + sale;
        }
        return month;
    }

    public int averageValueMonth(int[] sales) {
        return calculateMonth(sales) / sales.length;

    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    public int belowTheAverageSales(int[] sales) {
        int belowMonth = 0;
        for (int sale : sales) {
            if (sale > averageValueMonth(sales)) {
                belowMonth = belowMonth + 1;
            }


            }

        return belowMonth;
    }

    public int aboveAverageSales(int[] sales) {
        int aboveMonth = 0;
        for (int sale : sales) {
            if (sale < averageValueMonth(sales)) {
               aboveMonth = aboveMonth + 1;
            }


        }

        return aboveMonth;
    }


    }




