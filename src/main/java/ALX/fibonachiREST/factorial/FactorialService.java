package ALX.fibonachiREST.factorial;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FactorialService {

    /**
     * @param n a natural number (0 is allowed)
     * @return a list of first n factorials
     * @throws IllegalArgumentException if n < 0
     */
    public static List<Long> getFactorials(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a natural number or a zero.");
        }

        List<Long> factorials = new ArrayList<>();

        long factorial = 1;
        factorials.add(factorial);

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            factorials.add(factorial);
        }

        return factorials;
    }
}
