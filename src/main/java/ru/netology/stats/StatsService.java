package ru.netology.stats;

public class StatsService {
    public double sumSalesMonth(int[] sale) {
        double sumSales = 0;
        for (int j : sale) {
            sumSales = sumSales + j; // сумма продаж всех месяцев
        }
        return sumSales;
    }

    public double aveSaleMonth(int[] sale) {

        double aveSale;

        aveSale = sumSalesMonth(sale) / sale.length; // вычислили средний размер продаж по всем месяцам

        return aveSale;
    }

    public int maxSaleMonth(int[] sale) {
        int maxSale = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] >= sale[maxSale]) {
                maxSale = i; // джавин номер ячейки данных с максимальным значением
            }
        }
        return maxSale + 1; // выводим порядковый номер ячейки с максимальным значением
    }

    public int minSaleMonth(int[] sale) {
        int minSale = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] <= sale[minSale]) {
                minSale = i; // джавин номер ячейки данных с минимальным значением
            }
        }
        return minSale + 1; // выводим порядковый номер ячейки с максимальным значением
    }

    public int belAveSaleMonth(int[] sale) {

        int belSale = 0;

        for (int t : sale) {
            if (t < aveSaleMonth(sale)) {
                belSale = belSale + 1;

            }
        }
        return belSale;
    }

    public int aboAveSaleMonth(int[] sale) {

        int aboSale = 0;

        for (int t : sale) {
            if (t > aveSaleMonth(sale)) {
                aboSale = aboSale + 1;

            }
        }
        return aboSale;
    }
}

