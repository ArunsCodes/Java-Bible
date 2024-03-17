package com.arunscodes;

public class test3 {
//    19
//    1 + 81 = 64 + 4 = 68 = 36 + 64 = 100 = 1

    public static void main(String args[]){
        Integer number = 21;

        System.out.print(checkHappyNumber(number));


    }

    static boolean checkHappyNumber(Integer number){
        Integer sum = getSquareSum(number);

            while(sum>1){
                sum=getSquareSum(sum);
                System.out.println(sum);
            }

        return sum==1;

    }

    static  Integer getSquareSum(Integer number){
        Integer unit = number%10; //9  // 2 // 0
        Integer tens = number/10; // 1
        Integer sum = 0;

        sum+= (int) Math.pow(unit,2); // 84
        if(tens >= 10)
            sum = getSquareSum(tens); // 12
        else
            sum += (int) Math.pow(tens,2);

        return sum;

    }

}
