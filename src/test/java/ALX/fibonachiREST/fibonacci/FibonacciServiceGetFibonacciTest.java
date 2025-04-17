package ALX.fibonachiREST.fibonacci;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class FibonacciServiceGetFibonacciTest {

    @Test
    void TestNegative() {
        assertThrows(
                IllegalArgumentException.class,
                () -> FibonacciService.getFibonacci(-1)
        );
        assertThrows(
                IllegalArgumentException.class,
                () -> FibonacciService.getFibonacci(-10)
        );
    }

    @Test
    void TestZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> FibonacciService.getFibonacci(0)
        );
    }

    @Test
    void TestPositive() {
        List<Long> testList = new ArrayList<>();
        testList.add(0L);
        testList.add(1L);
        testList.add(1L);
        testList.add(2L);
        testList.add(3L);
        testList.add(5L);
        testList.add(8L);

        assertEquals(testList, FibonacciService.getFibonacci(7));
    }

    @Test
    void TestBig() {
        assertThrows(
                IllegalArgumentException.class,
                () -> FibonacciService.getFibonacci(10000)
        );
    }
}