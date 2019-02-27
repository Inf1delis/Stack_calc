package stackCalc.exceptions;

import java.io.IOException;

public class NegativeRootException extends IOException {
    public NegativeRootException() {
        super("Корень из отрицательного числа");
    }
}
