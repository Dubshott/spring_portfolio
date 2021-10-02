package com.example.sping_portfolio.controllers.balgolab.Algorithims;

public class DivFor extends _Div {
    public DivFor() { super(); }
    public DivFor(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "For";
        long limit = super.size;

        for (long[] f = new long[]{1000000, 500000}; limit-- > 0; f = new long[]{f[1], f[1]/2})
            super.setData(f[0]);
    }
}
