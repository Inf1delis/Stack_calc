package stackCalc.commands.history;

import stackCalc.commands.CommandInterface;

public class HistoryData {
    private CommandInterface command;
    private double a;
    private double b;
    private String define = "";

    HistoryData(CommandInterface command, String define, double b) {
        this.command = command;
        this.define = define;
        this.a = Double.NaN;
        this.b = b;
    }

    HistoryData(CommandInterface command, double a) {
        this.command = command;
        this.a = a;
        this.b = Double.NaN;
    }

    HistoryData(CommandInterface command, String define) {
        this.command = command;
        this.define = define;
        this.a = Double.NaN;
        this.b = Double.NaN;
    }

    HistoryData(CommandInterface command) {
        this.command = command;
        this.a = Double.NaN;
        this.b = Double.NaN;
    }

    @Override
    public String toString() {

        if (Double.isNaN(b) & Double.isNaN(a) & define.equals("")) {
            return String.format("%s\n", command.commandName());
        }

        if (Double.isNaN(a) & Double.isNaN(b) & !define.equals("")) {
            return String.format("%s %s\n", command.commandName(), define);
        }

        if (Double.isNaN(b) & define.equals("")) {
            return String.format("%s %f\n", command.commandName(), a);
        }

        return String.format("%s %s %f\n", command.commandName(), define, b);
    }
}
