package ALX.fibonachiREST.factorial;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FactorialService {

    /**
     * @param n a natural number
     * @return a list of first n factorials
     * @throws IllegalArgumentException if n <= 0 or calculated factorial too big
     */
    public static List<Long> getFactorials(int n) throws IllegalArgumentException {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a natural number.");
        }

        List<Long> factorials = new ArrayList<>();

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            factorials.add(factorial);

            if (factorial < 0) {
                throw new IllegalArgumentException("Factorial is too big.");
            }
        }

        return factorials;
    }
}
