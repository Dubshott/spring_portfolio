package com.example.sping_portfolio.controllers.balgolab.Algorithims;


import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.sping_portfolio.controllers.kalgolab.AlgoModel.ArithFor;
import com.example.sping_portfolio.controllers.kalgolab.AlgoModel.ArithRecurse;
import com.example.sping_portfolio.controllers.kalgolab.AlgoModel.ArithStream;
import com.example.sping_portfolio.controllers.kalgolab.AlgoModel.ArithWhile;
import lombok.Getter;

@Getter
public abstract class _Arithmetic {
    int size;
    String name;
    int hashID;
    Duration timeElapsed;
    ArrayList<Long> list;
    HashMap<Integer, Object> hash;

    public _Arithmetic() {
        this( 20);
    }

    public _Arithmetic(int nth) {
        this.size = nth;
        this.list = new ArrayList<>();
        this.hashID = 0;
        this.hash = new HashMap<>();

        Instant start = Instant.now();
        this.init();
        Instant end = Instant.now();
        this.timeElapsed = Duration.between(start, end);
    }
    protected abstract void init();

    public void setData(long num) {
        list.add(num);
        hash.put(this.hashID++, list.clone());
    }

    public int getTimeElapsed() { return timeElapsed.getNano(); }
    public long getNth() { return list.get(size - 1); }
    public Object getNthSeq(int i) { return hash.get(i); }

    public static void main(String[] args) {
        ArithFor.main(null);
        ArithRecurse.main(null);
        ArithStream.main(null);
        ArithWhile.main(null);
    }
}
