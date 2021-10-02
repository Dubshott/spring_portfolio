package com.example.sping_portfolio.controllers.ralgolab.AlgoModel;


public class MultWhile extends _Arithmetic {
    public MultWhile() {
        super();
    }
    public MultWhile(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "While";

        long limit = super.size;
        long[] f = new long[]{0, 3};
        while (limit-- > 0) {
            super.setData(f[0]);
            f = new long[]{f[1], 3 * f[1]};
        }
    }
}
