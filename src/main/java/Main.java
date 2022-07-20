import ru.netology.StatsService.stats.StatsService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int sum = service.sumSales(sales);
        int average = service.averageSales(sales);
        int minMonth = service.minSales(sales);
        int maxMonth = service.maxSales(sales);
        int below = service.belowAverage(sales);
        int above = service.aboveAverage(sales);
        System.out.println(sum);
        System.out.println(average);
        System.out.println(minMonth);
        System.out.println(maxMonth);
        System.out.println(below);
        System.out.println(above);


    }
}
