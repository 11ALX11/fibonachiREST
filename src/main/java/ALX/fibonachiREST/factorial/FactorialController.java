package ALX.fibonachiREST.factorial;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FactorialController {

    private final FactorialService factorialService;

    public FactorialController(FactorialService factorialService) {
        this.factorialService = factorialService;
    }

    @GetMapping("/factorial/{n}")
    public List<Long> getFactorials(@PathVariable int n) {
        return FactorialService.getFactorials(n);
    }
}
