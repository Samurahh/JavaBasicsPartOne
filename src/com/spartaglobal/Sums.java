package com.spartaglobal;

public class Sums {
    enum NumberType{
        EVEN,
        ODD
    }
    public static int getSum(int size, Sums.NumberType type){
        if(size<=0){
            throw new IllegalArgumentException("getSum: Size has to be bigger than 0.");
        }else if (size>46340){
            throw new IllegalArgumentException("getSum: Range exceeded. Max size can be 46340.");
        }else{
            return generateSum(size, type);
        }
    }

    private static int generateSum(int size, Sums.NumberType type){
        int startNumber = 0;
        int sum = 0;
        if (type == Sums.NumberType.ODD) {
            startNumber = 1;
        }
        for(int i = 0;i<size;i++){
            sum += startNumber;
            startNumber += 2;
        }
        return sum;
    }
}
