package com.example.sping_portfolio.controllers.aalgolab.AlgorithmModel;

public class GeometricWhile extends _Geometric {
    public GeometricWhile() {
        super();
    }
    public GeometricWhile(int nth) {
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
