package com.example.sping_portfolio.controllers.ralgolab.SubModel;


public class SubFor extends _Subtraction {
    public SubFor() { super(); }
    public SubFor(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "For";
        long limit = super.size;

        for (long[] f = new long[]{100, 95}; limit-- > 0; f = new long[]{f[1], f[1]-5})
            super.setData(f[0]);
    }
}
