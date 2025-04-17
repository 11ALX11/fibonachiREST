package ALX.fibonachiREST.fibonacci;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FibonacciService {

    /**
     * @param n a natural number
     * @return a list of first n fibonacci numbers
     * @throws IllegalArgumentException if n <= 0 or calculated number too big
     */
    public static List<Long> getFibonacci(int n) throws IllegalArgumentException {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a natural number.");
        }

        List<Long> fibonacciNumbers = new ArrayList<>();

        long a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            fibonacciNumbers.add(a);
            long next = a + b;
            a = b;
            b = next;

            if (a < 0) {
                throw new IllegalArgumentException("Fibonacci number is too big.");
            }
        }
        return fibonacciNumbers;
    }
}
