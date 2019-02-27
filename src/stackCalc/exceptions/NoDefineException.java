package stackCalc.exceptions;

import java.io.IOException;

public class NoDefineException extends IOException {
    public NoDefineException() {
        super("Такого DEFINE не существует");
    }
}
