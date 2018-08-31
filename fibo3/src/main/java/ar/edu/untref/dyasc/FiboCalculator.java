package ar.edu.untref.dyasc;

public class FiboCalculator {
    
    private int[] result;

    public FiboCalculator(int value) {
        super();
        int[] result = new int[value];
        for (int x = 0; x < value ; x++){
            result[0] = this.getValue(x);
        } 
        this.result = result;
    }
    
    private int getValue(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        return getValue(x-1) + getValue(x-2);
    }
    
    public int[] getFibonacciSuccession() {
        return this.result;
    }
}
