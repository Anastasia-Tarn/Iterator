package org.example;

public class Main {
    public static void main(String[] args) {

        Randoms random = new Randoms(90, 100);
        for (int r : random) {
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}