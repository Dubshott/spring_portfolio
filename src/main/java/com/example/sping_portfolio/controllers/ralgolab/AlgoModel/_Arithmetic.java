package com.example.sping_portfolio.controllers.ralgolab.AlgoModel;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.sping_portfolio.controllers.ralgolab.AlgoModel.MultFor;
import com.example.sping_portfolio.controllers.ralgolab.AlgoModel.MultRecurse;
import com.example.sping_portfolio.controllers.ralgolab.AlgoModel.MultStream;
import com.example.sping_portfolio.controllers.ralgolab.AlgoModel.MultWhile;
import lombok.Getter;

@Getter
abstract class _Arithmetic {
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
        MultFor.main(null);
        MultRecurse.main(null);
        MultStream.main(null);
        MultWhile.main(null);
    }
}
