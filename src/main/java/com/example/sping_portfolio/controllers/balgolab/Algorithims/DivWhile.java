package com.example.sping_portfolio.controllers.balgolab.Algorithims;

public class DivWhile extends _Div {
    public DivWhile() {
        super();
    }
    public DivWhile(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "While";

        long limit = super.size;
        long[] f = new long[]{1000000,500000};
        while (limit-- > 0) {
            super.setData(f[0]);
            f = new long[]{f[1], f[1]/2};
        }
    }
}
