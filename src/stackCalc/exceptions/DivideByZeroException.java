package stackCalc.exceptions;

import java.io.IOException;

public class DivideByZeroException extends IOException {
    public DivideByZeroException() {
        super("Деление на ноль");
    }
}
