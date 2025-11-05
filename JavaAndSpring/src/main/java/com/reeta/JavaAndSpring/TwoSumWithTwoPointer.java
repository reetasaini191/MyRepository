package com.reeta.twopointer;

public class TwoSumWithTwoPointer {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 ,7};
        int target= 9;
       int[] result = twoSum( nums,target);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found.");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int left=0;
        int right= nums.length-1;
        while (left<right)
        {
            int sum = nums[left] + nums[right];
            if(sum == target){
                return new int[]{left,right};
            } else if (sum<target) {
                left++;
            } else  {
                right--;

            }
        } return new int[]{};


    }
}
