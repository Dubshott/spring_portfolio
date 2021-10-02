package com.example.sping_portfolio.controllers.balgolab.Algorithims;

public class ArithWhile extends _Arithmetic {
    public ArithWhile() {
        super();
    }
    public ArithWhile(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "While";

        long limit = super.size;
        long[] f = new long[]{0, 6};
        while (limit-- > 0) {
            super.setData(f[0]);
            f = new long[]{f[1], 6 + f[1]};
        }
    }
}
