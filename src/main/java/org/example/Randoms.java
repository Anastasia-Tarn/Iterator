package org.example;


import java.util.*;
import java.util.Random;


public class Randoms implements Iterable<Integer> {
    private final int min;
    private final int max;
    protected Random random;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }



    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            int nextNumber;
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int i = max - min + 1;
                return random.nextInt(Math.abs(i)) + min;
            }
        };

    }
}







