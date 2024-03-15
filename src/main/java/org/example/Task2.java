package org.example;

public class Task2 {
    public void task2() {
        int a = 0;
        a = new Task2.A().increment(a);
        if (a != 1) {
            throw new RuntimeException("Expected a to be 1");
        }
    }

    private static class A {
        public int increment(int a) {
            return ++a;
        }
    }
}
