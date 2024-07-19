package org.example;

public class Fib {
    public static void main(String[] args) {
        int first = 0, second = 1, next, i, count = 10;
        System.out.println(first);
        System.out.println(first+second);
        for (i = 2; i < count; i++){
            next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }
    }
}
