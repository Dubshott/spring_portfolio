package com.example.sping_portfolio.controllers.balgolab.Algorithims;

public class div3 extends _division {
    public div3() { super(); }
    public div3(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "For";
        long limit = super.size;

        for (long[] f = new long[]{0, 6}; limit-- > 0; f = new long[]{f[1], 3 / f[1]})
            super.setData(f[0]);
    }
}
