package com.example.sping_portfolio.controllers.aalgolab.AlgorithmModel;

public class GeometricRecurse extends _Geometric {
    public GeometricRecurse() {
        super();
    }
    public GeometricRecurse(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        //setup for recursion
        super.name = "Recursion";
        long limit = super.size;
        long[] f = new long[]{0, 6};
        initRecurse(limit,f);
    }

    private void initRecurse(long limit, long[] f) {
        if (limit == 0) return;
        super.setData(f[0]);
        initRecurse(--limit, new long[]{f[1], 6 + f[1]});
    }
}
