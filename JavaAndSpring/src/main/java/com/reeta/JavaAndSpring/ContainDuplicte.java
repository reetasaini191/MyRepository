package com.reeta.basics;

import java.util.HashMap;

public class ContainDuplicte
{
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 4, 1};
        boolean result = hasDuplicate( nums);
        System.out.println("Contains duplicate: " + result);
    }


        public static boolean hasDuplicate(int[] nums) {
            HashMap<Integer, Boolean> map = new HashMap<>();


            for(int i=0; i< nums.length;i++){
                if(map.containsKey(nums[i])){
                    return true;

                }map.put(nums[i],true);
            }
            return false;
        }




}
