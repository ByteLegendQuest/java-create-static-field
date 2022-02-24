package com.bytelegend;

public class StaticField {
    public static String message() {
        return "Hello";
    }

public class Challenge {
    public static void main(String[] args) {
        System.out.println(message + ", world!");
    }
}
