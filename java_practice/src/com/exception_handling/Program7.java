package com.exception_handling;

public class Program7 {
    public static void main(String[] args) {
        String str = "Hello";
        char ch = ' ';
        try {
             ch = str.charAt(10); // StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException occurred: " + e.getMessage());
        }
        System.out.println("output: "+ ch);
    }
}

