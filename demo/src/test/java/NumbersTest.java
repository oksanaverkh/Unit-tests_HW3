import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.Numbers;

public class NumbersTest {
    private Numbers number;

    @BeforeEach
    public void setUp() {
        number = new Numbers(26);
    }

    // *Задание 1.
    // Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет,
    // является ли переданное число четным или нечетным.
    // (код приложен в презентации)
    @Test
    void evenOddNumberTestWhenTrue() {
        boolean expectedResult = number.evenOddNumber();
        assertTrue(expectedResult, "Incorrect work of the method evenOddNumber()");
    }

    @Test
    void evenOddNumberTestWhenFalse() {
        number.setN(3);
        boolean expectedResult = number.evenOddNumber();
        assertFalse(expectedResult, "Incorrect work of the method evenOddNumber()");
    }

    // Задание 2.
    // Разработайте и протестируйте метод numberInInterval, который проверяет,
    // попадает ли переданное число в интервал (25;100).
    // (код приложен в презентации)
    @Test
    void numberInIntervalTestWhenTrue() {
        boolean expectedResult = number.numberInInterval(25, 100);
        assertTrue(expectedResult, "Incorrect work of the method numberInInterval()");
    }

    @Test
    void numberInIntervalTestWhenFalse() {
        number.setN(3);
        boolean expectedResult = number.numberInInterval(25, 100);
        assertFalse(expectedResult, "Incorrect work of the method numberInInterval()");
    }
}
