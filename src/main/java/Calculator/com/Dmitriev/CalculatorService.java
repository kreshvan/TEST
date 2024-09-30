


package Calculator.com.Dmitriev;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class CalculatorService {

    public String Hello() {
        return "Добро пожаловать в калькулятор!";
    }

    public int getSumma(Integer a, Integer b) {
        return a + b;
    }

    public int getMinus(Integer a, Integer b) {
        return a - b;
    }

    public int getMultiply(Integer a, Integer b) {
        return a * b;
    }

    public int getDivide(Integer a, Integer b) {
        return a / b;
    }


}
