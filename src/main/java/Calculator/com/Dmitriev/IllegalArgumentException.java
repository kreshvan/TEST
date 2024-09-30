
package Calculator.com.Dmitriev;

public class IllegalArgumentException extends RuntimeException {
    public IllegalArgumentException() {
        super("Деление на 0 запрещено!!!");
    }

    public IllegalArgumentException(String sms) {
super(sms);
    }

}

