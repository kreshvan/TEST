

package Calculator.com.Dmitriev;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorParameterServiceTest {
    final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @CsvSource(value = {"3,4", "0,0", "-1,-3", "0,-1"})
    void getSummaParameter (int a, int b) {
        int result = a + b;
        int actual = calculatorService.getSumma(a, b);
        assertEquals(result, actual);

    }

    @ParameterizedTest
    @CsvSource(value = {"3,4", "0,0", "-1,-3", "0,-1"})
    void getMinusParameter(int a, int b) {
        int result = a - b;
        int actual = calculatorService.getMinus(a, b);
        assertEquals(result, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"3,4", "0,0", "-1,-3", "0,-1"})
    void getMultiplyParameter(int a, int b) {
        int result = a * b;
        int actual = calculatorService.getMultiply(a, b);
        assertEquals(result, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"3,3", "0,1", "-1,-3", "0,-1"})
    void getDivideParameter(int a, int b) {
        int result = a / b;
        int actual = calculatorService.getDivide(a, b);
        assertEquals(result, actual);
    }
}


