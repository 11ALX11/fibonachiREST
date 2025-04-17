package ALX.fibonachiREST.fibonacci;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FibonacciController {

    private final FibonacciService fibonacciService;

    public FibonacciController(FibonacciService fibonacciService) {
        this.fibonacciService = fibonacciService;
    }

    @GetMapping("/fibonacci/{n}")
    public List<Long> getFibonacci(@PathVariable int n) {
        return fibonacciService.getFibonacci(n);
    }
}
