package com.example.sping_portfolio.controllers.ralgolab.SubModel;



public class SubRecurse extends _Subtraction {
    public SubRecurse() {
        super();
    }
    public SubRecurse(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        //setup for recursion
        super.name = "Recursion";
        long limit = super.size;
        long[] f = new long[]{100, 95};
        initRecurse(limit,f);
    }

    private void initRecurse(long limit, long[] f) {
        if (limit == 0) return;
        super.setData(f[0]);
        initRecurse(--limit, new long[]{f[1], f[1]-5});
    }
}
