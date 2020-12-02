package com.spartaglobal;

public class Homework {
    enum NumberType{
        EVEN,
        ODD
    }
/*
 *
 *
 *
 */
    public static void swap(int[] array){
        for(int i = 0; i<(array.length)/2; i++){
            int temp = array[i];
            array[i] = array[(array.length-1)-i];
            array[(array.length-1)-i] = temp;
        }
    }


    public static int getSum(int size, NumberType type){
        if(size<=0){
            throw new IllegalArgumentException("getSum: Size has to be bigger than 0.");
        }else if (size>46340){
            throw new IllegalArgumentException("getSum: Range exceeded. Max size can be 46340.");
        }else{
            return generateSum(size, type);
        }
    }

    private static int generateSum(int size, NumberType type){
        int startNumber = 0;
        int sum = 0;
        if (type == NumberType.ODD) {
            startNumber = 1;
        }
        for(int i = 0;i<size;i++){
            sum += startNumber;
            startNumber += 2;
        }
        return sum;
    }

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
        int firstP = 1;
        int secondP = 1;
        switch(size){
            case 1: return new int[] {firstP};
            case 2: return new int[] {firstP, secondP};
            default: {
                int[] fibonacci = new int[size];
                fibonacci[0] = firstP;
                fibonacci[1] = secondP;
                for(int i = 2;i<size;i++){
                    int nextNumber = firstP + secondP;
                    firstP = secondP;
                    secondP = nextNumber;
                    fibonacci[i] = nextNumber;
                }
                return fibonacci;
            }
        }
    }
}
