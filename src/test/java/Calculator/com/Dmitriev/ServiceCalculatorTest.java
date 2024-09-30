

package Calculator.com.Dmitriev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.env.RandomValuePropertySource;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

class ServiceCalculatorTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    @DisplayName("Корректно складываю 2 параметра")
    void getSumma() {
        int a = nextInt();
        int b = nextInt();
        int result = a + b;
        int actual = calculatorService.getSumma(a, b);
        assertEquals(result, actual);
    }

    @Test
    @DisplayName("Выброс ошибки")
    void getSumma1() {
        assertThatExceptionOfType(IllegalArgumentException.class).
                isThrownBy(() -> calculatorService.getSumma(4, null));
    }


    @Test
    @DisplayName("Корректная разность 2х параметров")
    void getMinus() {
        int a = 5;
        int b = 4;
        int result = a - b;
        int actual = calculatorService.getMinus(a, b);
        assertEquals(result, actual);
    }

    @Test
    @DisplayName("Выброс ошибки")
    void getMinus1() {
        assertThatExceptionOfType(  IllegalArgumentException.class).
                isThrownBy(() -> calculatorService.getMinus(4, null));
    }

    @Test
    @DisplayName("Корректное умножение  2х параметров")
    void getMultiply() {
        int a = nextInt();
        int b = nextInt();
        int result = a * b;
        int actual = calculatorService.getMultiply(a, b);
        assertEquals(result, actual);
    }

    @Test
    @DisplayName("Выброс ошибки")
    void getMultiply1() {
        assertThatExceptionOfType(IllegalArgumentException.class).////fdfddfdfdf
                isThrownBy(() -> calculatorService.getMultiply(4, null));
    }

    @Test
    void getDivide() {
        int a = 3;
        int b = 3;
        int result = a / b;
        int actual = calculatorService.getDivide(a, b);
        assertEquals(result, actual);
    }

    @Test
    @DisplayName("Выброс ошибки")
    void getDivide1() {
        assertThatExceptionOfType(IllegalArgumentException.class).
                isThrownBy(() -> calculatorService.getDivide(4, null));
    }

    @Test
    @DisplayName("Выброс ошибки")
    void getDivide2() {
        assertThatExceptionOfType(IllegalArgumentException.class).
                isThrownBy(() -> calculatorService.getDivide(4, 0));
    }

    private int nextInt() {
        return 0;
    }
}

