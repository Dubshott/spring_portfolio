package com.example.sping_portfolio.controllers.ralgolab.AlgoModel;


public class MultRecurse extends _Arithmetic {
    public MultRecurse() {
        super();
    }
    public MultRecurse(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        //setup for recursion
        super.name = "Recursion";
        long limit = super.size;
        long[] f = new long[]{0, 3};
        initRecurse(limit,f);
    }

    private void initRecurse(long limit, long[] f) {
        if (limit == 0) return;
        super.setData(f[0]);
        initRecurse(--limit, new long[]{f[1], 3 * f[1]});
    }
}
