package stackCalc.commands.one_arg;


import stackCalc.exceptions.NegativeRootException;

public class Sqrt extends OneArgumentPattern {

    @Override
    public String commandName() {
        return "sqrt";
    }

    @Override
    protected double solve(double a) throws NegativeRootException {
        if (a < 0) {
            throw new NegativeRootException();
        }
        return Math.sqrt(a);
    }

}
