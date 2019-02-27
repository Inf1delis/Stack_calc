package stackCalc.exceptions;

import java.io.IOException;

public class EmptyStackException extends IOException {
    public EmptyStackException() {
        super("В стэке нет элементов");
    }
}
