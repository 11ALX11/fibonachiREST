package ALX.fibonachiREST;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @After("execution(public * ALX.fibonachiREST.factorial.FactorialController.*(..)) || " +
           "execution(public * ALX.fibonachiREST.fibonacci.FibonacciController.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        logger.info("Called method: {}", joinPoint.getSignature().getName());
    }
}
