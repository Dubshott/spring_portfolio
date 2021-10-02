package com.example.sping_portfolio.controllers.balgolab.Algorithims;

import java.util.stream.Stream;

public class DivStream extends _Div {
    public DivStream() {
        super();
    }
    public DivStream(int nth) {
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
