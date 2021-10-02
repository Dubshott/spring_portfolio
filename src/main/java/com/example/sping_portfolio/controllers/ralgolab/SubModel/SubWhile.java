package com.example.sping_portfolio.controllers.ralgolab.SubModel;


public class SubWhile extends _Subtraction {
    public SubWhile() {
        super();
    }
    public SubWhile(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "While";

        long limit = super.size;
        long[] f = new long[]{100,95};
        while (limit-- > 0) {
            super.setData(f[0]);
            f = new long[]{f[1], f[1]-5};
        }
    }
}