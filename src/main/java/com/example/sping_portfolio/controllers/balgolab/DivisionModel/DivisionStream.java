package com.example.sping_portfolio.controllers.balgolab.DivisionModel;

import java.util.stream.Stream;

public class DivisionStream extends _Division {
    public DivisionStream() {
        super();
    }
    public DivisionStream(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "Stream";

        Stream.iterate(new long[]{10000000, 500000}, f -> new long[]{f[1], f[1]/2})
                .limit(super.size)
                .forEach(f -> super.setData(f[0]) );
    }
}
