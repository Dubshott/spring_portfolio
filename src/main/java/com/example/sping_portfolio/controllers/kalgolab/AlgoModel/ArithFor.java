package com.example.sping_portfolio.controllers.kalgolab.AlgoModel;

public class ArithFor extends _Arithmetic {
    public ArithFor() { super(); }
    public ArithFor(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "For";
        long limit = super.size;
        // for loops are likely the most common iteration structure, all the looping facts are in one line
        for (long[] f = new long[]{0, 1}; limit-- > 0; f = new long[]{f[1], f[0] + f[1]})
            super.setData(f[0]);
    }

    public static void main(String[] args) {
        _Arithmetic arithmetic = new ArithFor(); // "FibFor" is used as initializer for the "_Fibonacci fibonacci"  object
        arithmetic.print();
    }
}
