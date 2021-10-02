package com.example.sping_portfolio.controllers.balgolab.Algorithims;

public class div5 extends _division {
    public div5() { super(); }
    public div5(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "For";
        long limit = super.size;

        for (long[] f = new long[]{0, 6}; limit-- > 0; f = new long[]{f[1], 5 / f[1]})
            super.setData(f[0]);
    }
}
