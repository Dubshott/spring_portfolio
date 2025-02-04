package com.example.sping_portfolio.controllers.aalgolab.AlgorithmModel;

public class GeometricFor extends _Geometric {
    public GeometricFor() { super(); }
    public GeometricFor(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "For";
        long limit = super.size;

        for (long[] f = new long[]{1, 3}; limit-- > 0; f = new long[]{f[1], 3*f[1]})
            super.setData(f[0]);
    }
}
