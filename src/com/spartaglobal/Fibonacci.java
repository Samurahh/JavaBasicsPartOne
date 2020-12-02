package com.spartaglobal;

public class Fibonacci {

    public static int[] getFibonacci(int size){
        if(size <= 0){
            throw new IllegalArgumentException("getFibonacci: Size has to be bigger than 0.");
        }else if(size > 46){
            throw new IllegalArgumentException("getFibonacci: Range exceeded. Max size can be 46.");
        }else{
            return generateFibonacci(size);
        }
    }

    private static int[] generateFibonacci(int size){
        int firstPosition = 1;
        int secondPosition = 1;
        switch(size){
            case 1: return new int[] {firstPosition};
            case 2: return new int[] {firstPosition, secondPosition};
            default: {
                int[] fibonacci = new int[size];
                fibonacci[0] = firstPosition;
                fibonacci[1] = secondPosition;
                for(int i = 2;i<size;i++){
                    int nextNumber = firstPosition + secondPosition;
                    firstPosition = secondPosition;
                    secondPosition = nextNumber;
                    fibonacci[i] = nextNumber;
                }
                return fibonacci;
            }
        }
    }

}
