package ar.edu.untref.dyasc;

import java.util.HashMap;

public class Interpreter {

    private String orientation = "h";
    private String direction = "o";
    private String name = null;
    private String mode = "l";
    private String error = null;
    private String number = "0";
    private HashMap<String, String> options = new HashMap<String, String>();
    
    public Interpreter(String[] args) {
        super();
        for (int x = 0; x < args.length; x++) {
            this.parseArgs(args[x]);
        }
    }
    
    private void parseArgs(String arg) {
        if (arg.contains("-o")) {
            String option = arg.substring(3, 5);
            if (option.contains("v") && option.contains("d")) {
                this.orientation = "v";
                this.direction = "d";
            } else if (option.contains("v") && option.contains("i")) {
                this.orientation = "v";
                this.direction = "i";
            } else if (option.contains("h") && option.contains("d")) {
                this.orientation = "h";
                this.direction = "d";
            } else if (option.contains("h") && option.contains("i")) {
                this.orientation = "h";
                this.direction = "i";
            } else {
                this.getError();
            }
        } else if (arg.contains("-m")) {
            String option = arg.substring(3, 4);
            if (option.contains("s") || option.contains("l")) {
                this.mode = option;
            } else {
                this.getError();
            }
        }
        else if (arg.contains("-f")) {
                this.name = arg.substring(3);
        } else {
            try
            {
               Integer.parseInt(arg);
               this.number = arg;
            }
            catch( Exception e)
            {
               this.getError();
            }
        }
    }
    
   private void getError() {
       this.error = "Bad Option";
   }
   
   public boolean hasOptionError() {
       return this.error != null;
   }
   
   public HashMap<String, String> getValuesMap() {
       this.options.put("orientation", this.orientation);
       this.options.put("direction", this.direction);
       this.options.put("mode", this.mode);
       this.options.put("name", this.name);
       this.options.put("number", this.number);
       this.options.put("error", this.error);
       return this.options;
   }
    
}
