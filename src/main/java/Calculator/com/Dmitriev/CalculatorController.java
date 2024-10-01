

package Calculator.com.Dmitriev;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping()
    public String Hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("/plus")
    public String GetSumma (Integer a, Integer b) {
        int result =  calculatorService.getSumma(a, b);
        return (a + "+" + b + "=" + (a+b));
    }

    @GetMapping("/minus")
    public String GetMinus(Integer a, Integer b) {
        int result =  calculatorService.getMinus(a, b);
        return (a + "-" + b + "=" + (a-b));
    }

    @GetMapping("/multiply")
    public String getMultiply (Integer a, Integer b) {
        int result =  calculatorService.getMultiply(a, b);
        return (a + "*" + b + "=" + (a*b));
    }

    @GetMapping("/divide")
    public String getDivide (Integer a, Integer b) {
        int result =  calculatorService.getDivide(a, b);
        return (a + "/" + b + "=" + (a/b));

    }
}