package com.spartaglobal;

import java.util.Arrays;

public class Starter {

    public static void start(){
        try {
            Printer.println(Arrays.toString(Homework.getFibonacci(0)));
        }catch (IllegalArgumentException e){
            Printer.println(e.getMessage());
        }        // getting fibonacci of size 0
        try {
            Printer.println(Arrays.toString(Homework.getFibonacci(50)));
        }catch (IllegalArgumentException e){
            Printer.println(e.getMessage());
        }        // getting fibonacci of size 50
        try {
            Printer.println(Arrays.toString(Homework.getFibonacci(30)));
        }catch (IllegalArgumentException e){
            Printer.println(e.getMessage());
        }        // getting fibonacci of size 30

        try {
            Printer.println(String.valueOf(Homework.getSum(0, Homework.NumberType.ODD)));
        }catch (IllegalArgumentException e){
            Printer.println(e.getMessage());
        }        // getting Sum of 0 ODD numbers
        try {
            Printer.println(String.valueOf(Homework.getSum(50000, Homework.NumberType.ODD)));
        }catch (IllegalArgumentException e){
            Printer.println(e.getMessage());
        }        // getting Sum of 50000 ODD numbers
        try {
            Printer.println(String.valueOf(Homework.getSum(46340, Homework.NumberType.ODD)));
        }catch (IllegalArgumentException e){
            Printer.println(e.getMessage());
        }        // getting Sum of 46340 ODD numbers

        try {
            Printer.println(String.valueOf(Homework.getSum(0, Homework.NumberType.EVEN)));
        }catch (IllegalArgumentException e){
            Printer.println(e.getMessage());
        }        // getting Sum of 0 EVEN numbers
        try {
            Printer.println(String.valueOf(Homework.getSum(50000, Homework.NumberType.EVEN)));
        }catch (IllegalArgumentException e){
            Printer.println(e.getMessage());
        }        // getting Sum of 50000 EVEN numbers
        try {
            Printer.println(String.valueOf(Homework.getSum(46340, Homework.NumberType.EVEN)));
        }catch (IllegalArgumentException e){
            Printer.println(e.getMessage());
        }        // getting Sum of 46340 EVEN numbers

        int[] valuesToSwap = new int[]{1,7,3,4,5,10,23};
        Printer.println(Arrays.toString(valuesToSwap));
        Homework.swap(valuesToSwap);
        Printer.println(Arrays.toString(valuesToSwap));

    }
}
