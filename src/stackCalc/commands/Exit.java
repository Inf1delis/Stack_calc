package stackCalc.commands;

import stackCalc.commands.history.History;
import stackCalc.exceptions.ExitException;


public class Exit implements CommandInterface {
    @Override
    public void doCommand() throws ExitException {
        History.add(this);
        throw new ExitException();
    }

    @Override
    public String commandName() {
        return "exit";
    }
}
