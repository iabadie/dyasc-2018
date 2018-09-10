package ar.edu.untref.dyasc;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class Printer {    

    private String printTotal(String option, int length, int value, String fileName) {
        String total = String.valueOf(value);
        String result = "fibo<"+length+">s:";
        if (option.equals("h")) {
            result += " " + total;
        }
        else {
            result += "\n" + total;
        }
        if (fileName != null) {
            this.writeAFile(fileName, result, length);
        } else {
            System.out.println(result);
        }
        return result;
    }

    private String printByDirection(String option, int[] list, String fileName) {
        int length = list.length;
        String result = "fibo<"+length+">:";
        for (int x = 0; x < length ; x++){
            String partialResult = String.valueOf(list[x]);
            result += option.equals("h") ? " " + partialResult : "\n" + partialResult;
        }
        if (fileName != null) {
            this.writeAFile(fileName, result, length);
        } else {
            System.out.println(result);
        }
        return result;
    }

    private void writeAFile(String fileName, String data, int length) {
        try {
        PrintWriter writer;
            writer = new PrintWriter(fileName, "UTF-8");
            writer.println(data);
            writer.close();
            System.out.println("fibo<" + length + "> guardado en " + fileName);
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public String printSuccession(HashMap<String, String> options, FiboCalculator fibo) {
        int[] list = fibo.getFibonacciSuccession(options.get("direction"));
        if (options.get("mode").equals("l")) {
            return this.printByDirection(options.get("orientation"), list, options.get("name"));
        } else {
            return this.printTotal(options.get("orientation"), list.length, fibo.getTotal(), options.get("name"));
        }        
    }

    public String printError() {
        System.out.println("Opciones no válidas.");
        return "Opciones no válidas.";
    }
}
