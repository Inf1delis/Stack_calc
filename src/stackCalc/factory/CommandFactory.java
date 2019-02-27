package stackCalc.factory;

import stackCalc.StackCalc;
import stackCalc.commands.*;
import stackCalc.commands.define.Define;
import stackCalc.commands.history.History;
import stackCalc.commands.one_arg.Cos;
import stackCalc.commands.one_arg.Sin;
import stackCalc.commands.one_arg.Sqrt;
import stackCalc.commands.one_arg.Square;
import stackCalc.commands.two_args.*;

public class CommandFactory {

    public static CommandInterface makeCommand(String str) {
        while (true) {
            switch (str.toLowerCase()) {
                case "divide":
                    return new Divide();
                case "multiply":
                    return new Multiply();
                case "minus":
                    return new Minus();
                case "sqrt":
                    return new Sqrt();
                case "plus":
                    return new Plus();
                case "cos":
                    return new Cos();
                case "sin":
                    return new Sin();
                case "degree":
                    return new Degree();
                case "square":
                    return new Square();
                case "define":
                    return new Define();
                case "history":
                    return new History();
                case "#":
                    return new Comment();
                case "print":
                    return new Print();
                case "push":
                    return new Push();
                case "exit":
                    return new Exit();

                default: {
                    if (str.charAt(0) == '#') {
                        return new Comment();
                    }
                    StackCalc.out.print("Повторите попытку ввода: ");
                    str = StackCalc.read.readString();
                }
            }

        }
    }
}
