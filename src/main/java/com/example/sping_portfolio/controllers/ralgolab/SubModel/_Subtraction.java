package com.example.sping_portfolio.controllers.ralgolab.SubModel;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;

import lombok.Getter;

@Getter
public abstract class _Subtraction {
    int size;
    String name;
    int hashID;
    Duration timeElapsed;
    ArrayList<Long> list;
    HashMap<Integer, Object> hash;

    public _Subtraction() {
        this( 20);
    }

    public _Subtraction(int nth) {
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
        SubFor.main(null);
        SubRecurse.main(null);
        SubStream.main(null);
        SubWhile.main(null);
    }
}
