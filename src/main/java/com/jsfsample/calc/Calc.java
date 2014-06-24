package com.jsfsample.calc;

import java.util.Random;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Calc {

    private long left;
    private long right;
    private long answer;

    public Calc() {
        Random rand = new Random(System.currentTimeMillis());
        left = Math.abs(rand.nextInt() % 10) + 1;
        right = Math.abs(rand.nextInt() % 10) + 1;
    }
}
