package com.example.sping_portfolio.controllers.ralgolab.AlgoModel;

import java.util.stream.Stream;

public class MultStream extends _Arithmetic {
    public MultStream() {
        super();
    }
    public MultStream(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "Stream";

        Stream.iterate(new long[]{0, 3}, f -> new long[]{f[1], 3 * f[1]})
                .limit(super.size)
                .forEach(f -> super.setData(f[0]) );
    }
}
