package stackCalc.read;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    private Scanner read;

    @Override
    public void close() {
        read.close();
    }

    public ConsoleReader() {
        read = new Scanner(System.in);
    }

    @Override
    public double readDouble() {
        return read.nextDouble();
    }

    @Override
    public String readString() {
        return read.next();
    }

    @Override
    public void comment() {
        read.nextLine();
    }
}

