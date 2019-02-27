package stackCalc.exceptions;

import java.io.IOException;

public class NotEnoughElementsException extends IOException {
    public NotEnoughElementsException() {
        super("Недостаточно элементов в стэке");
    }
}
