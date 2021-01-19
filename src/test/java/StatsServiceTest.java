import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {
        StatsService service = new StatsService();
//        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverage() {
        StatsService service = new StatsService();
        float expected = 15F;

        float actual = service.calculateAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findPeakMonth() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.findPeakMonth(purchases);
        assertEquals(expected, actual);

    }

    @Test
    void findMinMonth() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.findMinMonth(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void monthsUnderAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthsUnderAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void monthsAboveAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthsUnderAverage(purchases);
        assertEquals(expected, actual);
    }
}