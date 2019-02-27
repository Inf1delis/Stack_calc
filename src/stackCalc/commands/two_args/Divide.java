package stackCalc.commands.two_args;

import stackCalc.exceptions.DivideByZeroException;

public class Divide extends TwoArgumentsPattern {

    @Override
    protected double solve(double a, double b) throws DivideByZeroException {
        if (a == 0) {
            throw new DivideByZeroException();
        }

        return b / a;
    }

    @Override
    public String commandName() {
        return "divide";
    }
}
