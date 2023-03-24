package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void sumSalesMonths() {

        StatsService service = new StatsService();

        int[] sale = {5, 37, 41, 8, 16, 25, 89, 48, 105, 7, 18, 126};

        int expectedSum = 525;
        double actualSum = service.sumSalesMonth(sale);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void aveSaleMonth() {
        StatsService service = new StatsService();

        int[] sale = {5, 37, 41, 8, 16, 25, 89, 48, 105, 7, 18, 126};

        double expectedAve = 43.75;
        double actualAve = service.aveSaleMonth(sale);

        Assertions.assertEquals(expectedAve, actualAve);
    }

    @Test
    public void maxSaleMonth() {
        StatsService service = new StatsService();

        int[] sale = {5, 37, 41, 8, 16, 25, 89, 48, 105, 7, 18, 126};

        int expectedMax = 12;
        int actualMax = service.maxSaleMonth(sale);

        Assertions.assertEquals(expectedMax, actualMax);

    }

    @Test
    public void minSaleMonth() {
        StatsService service = new StatsService();

        int[] sale = {5, 37, 41, 8, 16, 25, 89, 48, 105, 7, 18, 126};

        int expectedMin = 1;
        int actualMin = service.minSaleMonth(sale);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void belAveSaleMonth() {
        StatsService service = new StatsService();

        int[] sale = {5, 37, 41, 8, 16, 25, 89, 48, 105, 7, 18, 126};

        int expectedBel = 8;
        int actualBel = service.belAveSaleMonth(sale);

        Assertions.assertEquals(expectedBel, actualBel);
    }

    @Test
    public void aboAveSaleMonth() {
        StatsService service = new StatsService();

        int[] sale = {5, 37, 41, 8, 16, 25, 89, 48, 105, 7, 18, 126};

        int expectedAbo = 4;
        int actualAbo = service.aboAveSaleMonth(sale);

        Assertions.assertEquals(expectedAbo, actualAbo);
    }

}
