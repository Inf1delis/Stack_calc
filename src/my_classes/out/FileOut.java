package my_classes.out;


import java.io.FileWriter;
import java.io.IOException;

public abstract class FileOut implements Out {
    protected FileWriter fileOut;

    @Override
    public void print(Object data) {
        try {
            fileOut.write((String) data + '\n');
            fileOut.flush();

        } catch (IOException e) {
            System.out.println("Ошибка вывода в файл");
        }
    }
}
