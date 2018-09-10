package ar.edu.untref.dyasc;

import java.util.HashMap;

public class Program {

    public static String main(String[] args) {
        Interpreter interpreter = new Interpreter(args);
        Printer printer = new Printer();
        if (interpreter.hasOptionError()) {
            return printer.printError();
        }
        HashMap<String, String> options = interpreter.getValuesMap();
        FiboCalculator fibo = new FiboCalculator(Integer.parseInt(options.get("number")));
        return printer.printSuccession(options, fibo);
    }
}
