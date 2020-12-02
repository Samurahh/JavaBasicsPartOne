package com.spartaglobal;

import java.util.Arrays;

public class Starter {

    public static void start(){
        try {
            Printer.println(Arrays.toString(Fibonacci.getFibonacci(0)));
        }catch (IllegalArgumentException e){
            Printer.println(e.getMessage());
        }        // getting fibonacci of size 0
        try {
            Printer.println(Arrays.toString(Fibonacci.getFibonacci(50)));
        }catch (IllegalArgumentException e){
            Printer.println(e.getMessage());
        }        // getting fibonacci of size 50
        try {
            Printer.println(Arrays.toString(Fibonacci.getFibonacci(30)));
        }catch (IllegalArgumentException e){
            Printer.println(e.getMessage());
        }        // getting fibonacci of size 30

        try {
            Printer.println(String.valueOf(Sums.getSum(0, Sums.NumberType.ODD)));
        }catch (IllegalArgumentException e){
            Printer.println(e.getMessage());
        }        // getting Sum of 0 ODD numbers
        try {
            Printer.println(String.valueOf(Sums.getSum(50000, Sums.NumberType.ODD)));
        }catch (IllegalArgumentException e){
            Printer.println(e.getMessage());
        }        // getting Sum of 50000 ODD numbers
        try {
            Printer.println(String.valueOf(Sums.getSum(46340, Sums.NumberType.ODD)));
        }catch (IllegalArgumentException e){
            Printer.println(e.getMessage());
        }        // getting Sum of 46340 ODD numbers

        try {
            Printer.println(String.valueOf(Sums.getSum(0, Sums.NumberType.EVEN)));
        }catch (IllegalArgumentException e){
            Printer.println(e.getMessage());
        }        // getting Sum of 0 EVEN numbers
        try {
            Printer.println(String.valueOf(Sums.getSum(50000, Sums.NumberType.EVEN)));
        }catch (IllegalArgumentException e){
            Printer.println(e.getMessage());
        }        // getting Sum of 50000 EVEN numbers
        try {
            Printer.println(String.valueOf(Sums.getSum(46340, Sums.NumberType.EVEN)));
        }catch (IllegalArgumentException e){
            Printer.println(e.getMessage());
        }        // getting Sum of 46340 EVEN numbers

        int[] valuesToSwap = new int[]{1,7,3,4,5,10,23};
        Printer.println(Arrays.toString(valuesToSwap));
        Homework.swap(valuesToSwap);
        Printer.println(Arrays.toString(valuesToSwap));

    }
}
