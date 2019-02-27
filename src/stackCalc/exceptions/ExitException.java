package stackCalc.exceptions;

public class ExitException extends RuntimeException {
    public ExitException() {
        super("Выход из программы");
    }
}
