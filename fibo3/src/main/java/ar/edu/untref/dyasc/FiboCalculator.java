package ar.edu.untref.dyasc;

public class FiboCalculator {

    private int value;
    private int[] result;

    public FiboCalculator(int value) {
        super();
        this.result = this.calculateSuccession(value);
        this.value = value;
    }

    private int[] calculateSuccession(int value) {
        int[] result = new int[value];
        for (int x = 0; x < value ; x++){
            result[x] = this.getValue(x);
        } 
        return result;
    }

    private int[] calculateSuccessionReverse(int value) {
        int[] result = new int[value];
        for (int x = value; x > 0 ; x--){
            result[value - x] = this.getValue(x - 1);
        } 
        return result;
    }

    // Recursive function to get all numbers from 0 to x position
    private int getValue(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        return getValue(x-1) + getValue(x-2);
    }

    // Get succession array in correct order
    public int[] getFibonacciSuccession(String option) {
        this.result =  option.equals("i") ? this.calculateSuccessionReverse(this.value) : this.calculateSuccession(this.value); 
        return this.result;
    }

    // Get total value adding each result value.
    public int getTotal() {
        int total = 0;
        for (int x = 0; x < this.result.length ; x++){
            total += this.result[x];
        }
        return total;
    }
}
