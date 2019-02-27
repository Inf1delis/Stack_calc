package stackCalc.commands;

import java.io.IOException;

public interface CommandInterface {
    void doCommand() throws IOException;

    String commandName();
}
