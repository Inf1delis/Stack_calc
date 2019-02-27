package stackCalc.commands;

import stackCalc.StackCalc;
import stackCalc.commands.history.History;
import stackCalc.exceptions.EmptyStackException;

import java.io.IOException;

public class Print implements CommandInterface {
    @Override
    public String commandName() {
        return "print";
    }

    @Override
    public void doCommand() throws IOException {

        try {
            String tmpString = StackCalc.data.peek().toString();
            StackCalc.out.print(tmpString);
            History.add(this);
        } catch (Exception e) {
            throw new EmptyStackException();
        }
    }
}
