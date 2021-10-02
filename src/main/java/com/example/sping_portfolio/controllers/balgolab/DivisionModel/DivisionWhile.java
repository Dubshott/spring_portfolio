package com.example.sping_portfolio.controllers.balgolab.DivisionModel;

public class DivisionWhile extends _Division {
    public DivisionWhile() {
        super();
    }
    public DivisionWhile(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "While";

        long limit = super.size;
        long[] f = new long[]{10000000, 500000};
        while (limit-- > 0) {
            super.setData(f[0]);
            f = new long[]{f[1], f[1]/2};
        }
    }
}
