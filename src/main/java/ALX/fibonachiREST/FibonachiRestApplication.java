package ALX.fibonachiREST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Задача: Java
 * Разработать код, максимально близкий к промышленному, включая обработку специальных и исключительных ситуаций, а также покрытие UnitTest-ами.
 * 1.  На вход натуральное число n. На выход контейнер с первыми n числами Фибоначчи.
 * 2.  На вход натуральное число n. На выход контейнер с первыми n факториалами.
 * * оформить в виде REST сервиса
 */
@SpringBootApplication
public class FibonachiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FibonachiRestApplication.class, args);
	}

}
