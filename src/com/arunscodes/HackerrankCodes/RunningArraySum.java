package com.arunscodes.HackerrankCodes;

public class RunningArraySum {

    public static int[] runningSum(int[] nums) {

        int[] temp = new int[nums.length];
        int prevSum = 0;

        for(int i =0;i<nums.length;i++){
            temp[i] = nums[i] + prevSum;
            prevSum = temp[i];
        }

        return temp;
    }


    public static void main(String[] args) {

        int[] nums = {1,1,1,1,1};

        int[] runningSum = runningSum(nums);




    }
}
