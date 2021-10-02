package com.example.sping_portfolio.controllers.ralgolab.AlgoModel;


public class MultFor extends _Arithmetic {
    public MultFor() { super(); }
    public MultFor(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "For";
        long limit = super.size;

        for (long[] f = new long[]{0, 3}; limit-- > 0; f = new long[]{f[1], 3 * f[1]})
            super.setData(f[0]);
    }
}