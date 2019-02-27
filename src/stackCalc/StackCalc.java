package stackCalc;


import my_classes.out.ConsoleOut;
import my_classes.out.Out;
import stackCalc.commands.CommandInterface;
import stackCalc.exceptions.ExitException;
import stackCalc.factory.CommandFactory;
import stackCalc.read.ConsoleReader;
import stackCalc.read.FileRead;
import stackCalc.read.Reader;

import java.io.IOException;
import java.util.Stack;


public class StackCalc {
    public static Stack<Double> data = new Stack<>();
    public static Reader read = new ConsoleReader();
    public static Out out = new ConsoleOut();


    public static void main(String[] args) {

        System.out.println("Введите путь до файла с командами:");
        String fileName = read.readString();

        try {

            StackCalc.read = new FileRead(fileName);

        } catch (IOException e) {

            System.out.println("Файл не найдет. Вводите команды с консоли:");
            StackCalc.read = new ConsoleReader();
        }

        while (true) {
            try {

                String CommandName = read.readString();
                CommandInterface command = CommandFactory.makeCommand(CommandName);
                command.doCommand();

            } catch (ExitException e) {
                out.print(e.getLocalizedMessage());
                break;

            } catch (Throwable e) {
                StackCalc.out.print(e);
            }
        }
    }

}
