package stackCalc.commands;

import stackCalc.commands.history.History;

import static stackCalc.StackCalc.read;

public class Comment implements CommandInterface {

    @Override
    public void doCommand() {
        read.comment();
        History.add(this);
    }

    @Override
    public String commandName() {
        return "command";
    }
}
