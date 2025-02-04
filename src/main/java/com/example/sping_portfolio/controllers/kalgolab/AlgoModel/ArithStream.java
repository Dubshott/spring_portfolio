package com.example.sping_portfolio.controllers.kalgolab.AlgoModel;

import java.util.stream.Stream;

public class ArithStream extends _Arithmetic {
    public ArithStream() {
        super();
    }
    public ArithStream(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "Stream";

        Stream.iterate(new long[]{0, 6}, f -> new long[]{f[1], 6 + f[1]})
                .limit(super.size)
                .forEach(f -> super.setData(f[0]) );
    }
}
