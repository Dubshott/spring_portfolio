package com.example.sping_portfolio.controllers.balgolab.Algorithims;

public class div2 extends _division {
    public div2() { super(); }
    public div2(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "For";
        long limit = super.size;

        for (long[] f = new long[]{0, 6}; limit-- > 0; f = new long[]{f[1], 2 / f[1]})
            super.setData(f[0]);
    }
}


