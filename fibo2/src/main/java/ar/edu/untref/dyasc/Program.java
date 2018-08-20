package ar.edu.untref.dyasc;

public class Program {
    static int f0 = 0;
    static int f1 = 1;

    public static void main(String[] args) {
        boolean h = true;
        boolean d = true;
        boolean hasOption = false;
        
        if (args.length > 0 && args[0].charAt(0) == '-' && args[0].length() > 3){
            String option = args[0];
            // Set option to V or H and D or I or print error in other cases.
            if (
                    option.charAt(2) != 'o' ||
                    (option.charAt(3) != 'h' && option.charAt(3) != 'v') ||
                    (option.charAt(4) != 'd' && option.charAt(4) != 'i'))
            {
                System.out.println("Opciones no validas.");
                return;
            }
            h = option.charAt(3) == 'h';
            d = option.charAt(4) == 'd';
            hasOption = true;
        }
        
        // if has option use second arg position else use first by default
        String number = args[0];
        
        if (hasOption) {
            number = args[1];
        }
        
        // generate display configuration checking the options results
        String format = " ";
        
        if (!h) {
            format = "\n";
        }
        
        int input = Integer.parseInt(number);
        String result = "Fibo<" + number + ">:";
        
        if (d) {
            for (int x = 0; x < input ; x++){
                result += getNextFormattedString(format, x);
            }
        } else {
            for (int x = input - 1; x >= 0 ; x--){
                result += getNextFormattedString(format, x);
            }
        }
        
        System.out.println(result);
    }
    
    // Append and return the new formatted string
    private static String getNextFormattedString(String format, int value) {
        return format + String.valueOf(getValue(value));
    }
    
    
    // Get recursive fibonacci number
    private static int getValue(int x) {
        if (x == 0) {
            return f0;
        }
        if (x == 1) {
            return f1;
        }
        return getValue(x-1) + getValue(x-2);
    }
}
