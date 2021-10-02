package com.example.sping_portfolio.controllers.aalgolab.AlgorithmModel;

import java.util.stream.Stream;

public class GeometricStream extends _Geometric {
    public GeometricStream() {
        super();
    }
    public GeometricStream(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "Stream";

        Stream.iterate(new long[]{1, 3}, f -> new long[]{f[1], 3*f[1]})
                .limit(super.size)
                .forEach(f -> super.setData(f[0]) );
    }
}
