package com.example.sping_portfolio.controllers.ralgolab.SubModel;


import java.util.stream.Stream;

public class SubStream extends _Subtraction {
    public SubStream() {
        super();
    }
    public SubStream(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "Stream";

        Stream.iterate(new long[]{100,95}, f -> new long[]{f[1], f[1]-5})
                .limit(super.size)
                .forEach(f -> super.setData(f[0]) );
    }
}