package ar.edu.untref.dyasc;

import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter(args);
        Printer printer = new Printer();
        if (interpreter.hasOptionError()) {
            printer.printError();
            return;
        }
        HashMap<String, String> options = interpreter.getValuesMap();
        FiboCalculator fibo = new FiboCalculator(Integer.parseInt(options.get("number")));
        printer.printSuccession(options, fibo);
    }
}
