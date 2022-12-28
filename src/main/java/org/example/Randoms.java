package org.example;


import java.util.*;
import java.util.Random;


public class Randoms implements Iterable<Integer> {
    protected Random random;

    public Randoms(int min, int max) {
        while (iterator().hasNext()) {
            int r = random.nextInt((max - min) + 1);
        }
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int pos = 0;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return iterator().next();
            }
        };
    }
}







