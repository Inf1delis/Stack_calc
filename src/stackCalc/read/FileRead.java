package stackCalc.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead implements Reader {
    private Scanner read;

    public FileRead(String filename) throws FileNotFoundException {
        read = new Scanner(new File(filename));
    }


    @Override
    public String readString() {
        return read.next();
    }

    @Override
    public double readDouble() {
        return read.nextDouble();
    }

    @Override
    public void comment() {
        read.nextLine();
    }

    @Override
    public void close() {
        read.close();
    }
}
