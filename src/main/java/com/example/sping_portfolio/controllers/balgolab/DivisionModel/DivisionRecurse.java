package com.example.sping_portfolio.controllers.balgolab.DivisionModel;

public class DivisionRecurse extends _Division {
    public DivisionRecurse() {
        super();
    }
    public DivisionRecurse(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        //setup for recursion
        super.name = "Recursion";
        long limit = super.size;
        long[] f = new long[]{10000000, 500000};
        initRecurse(limit,f);
    }

    private void initRecurse(long limit, long[] f) {
        if (limit == 0) return;
        super.setData(f[0]);
        initRecurse(--limit, new long[]{f[1], f[1]/2});
    }
}
