package stackCalc.read;

import java.io.Closeable;

public interface Reader extends Closeable {
    String readString();

    double readDouble();

    void comment();
}
