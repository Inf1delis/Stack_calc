package stackCalc.commands.define;

public class DefineElement {
    String name;
    double value;

    public DefineElement(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public void print() {
        System.out.println(toString());
    }

    public String toString() {
        return String.format("Name: %s\nValue: %f", name, value);
    }
}
