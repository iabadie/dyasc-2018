package ar.edu.untref.dyasc;

public class Program {
    static int f0 = 0;
    static int f1 = 1;

    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        String result = "Fibo<" + args[0] + ">:";
        for (int x = 0; x < input ; x++){
            result += " " + String.valueOf(getValue(x));
        }
        System.out.println(result);
    }
    
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
