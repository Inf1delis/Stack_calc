package stackCalc.commands.one_arg;

import stackCalc.StackCalc;
import stackCalc.commands.CommandInterface;
import stackCalc.commands.history.History;
import stackCalc.exceptions.EmptyStackException;
import stackCalc.exceptions.NegativeRootException;

import java.io.IOException;


public abstract class OneArgumentPattern implements CommandInterface {

    protected abstract double solve(double a) throws IOException;

    public abstract String commandName();

    @Override
    public void doCommand() throws IOException {
        errorCheck();
    }

    private void errorCheck() throws IOException {
        double a = 0;

        if (StackCalc.data.empty()) {
            throw new EmptyStackException();
        }

        try {
            a = StackCalc.data.pop();
            Double tmp = solve(a);
            StackCalc.data.push(tmp);
            History.add(this);

        } catch (NegativeRootException | EmptyStackException e) {
            StackCalc.data.push(a );
            throw new NegativeRootException();

        }
    }
}
