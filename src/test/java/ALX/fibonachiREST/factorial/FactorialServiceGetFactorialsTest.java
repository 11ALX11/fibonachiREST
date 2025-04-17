package ALX.fibonachiREST.factorial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class FactorialServiceGetFactorialsTest {

    @Test
    void TestNegative() {
        assertThrows(
                IllegalArgumentException.class,
                () -> FactorialService.getFactorials(-1)
        );
        assertThrows(
                IllegalArgumentException.class,
                () -> FactorialService.getFactorials(-10)
        );
    }

    @Test
    void TestZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> FactorialService.getFactorials(0)
        );
    }

    @Test
    void TestPositive() {
        List<Long> testList = new ArrayList<>();
        testList.add(1L);
        testList.add(2L);
        testList.add(6L);
        testList.add(24L);
        testList.add(120L);

        assertEquals(testList, FactorialService.getFactorials(5));
    }

    @Test
    void TestBig() {
        assertThrows(
                IllegalArgumentException.class,
                () -> FactorialService.getFactorials(10000)
        );
    }
}