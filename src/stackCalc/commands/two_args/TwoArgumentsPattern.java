package stackCalc.commands.two_args;

import stackCalc.StackCalc;
import stackCalc.commands.CommandInterface;
import stackCalc.commands.history.History;
import stackCalc.exceptions.DivideByZeroException;
import stackCalc.exceptions.EmptyStackException;
import stackCalc.exceptions.NotEnoughElementsException;

import java.io.IOException;


public abstract class TwoArgumentsPattern implements CommandInterface {

    protected abstract double solve(double a, double b) throws IOException;

    public abstract String commandName();

    @Override
    public void doCommand() throws IOException {
        errorCheck();
    }

    private void errorCheck() throws IOException {
        double a = 0;
        double b = 0;
        if (StackCalc.data.empty()) {
            throw new EmptyStackException();
        }

        try {
            a = StackCalc.data.pop();
            b = StackCalc.data.pop();
            Double tmp = solve(a, b);
            StackCalc.data.push(tmp);
            History.add(this);

        } catch (DivideByZeroException e) {
            StackCalc.data.push(b);
            StackCalc.data.push(a);
            throw new DivideByZeroException();

        } catch (java.util.EmptyStackException e) {
            StackCalc.data.push(a);
            throw new NotEnoughElementsException();

        }
    }
}
