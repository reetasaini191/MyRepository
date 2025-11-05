package com.reeta.basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestPalidrome {

        public static void main(String[] args) {
            String str = "abdybayd";
            //Expected answer is : true

            boolean isPalindromePossible = checkPalindromePossibility(str);
            System.out.println("Is palindrome possible ? : " + isPalindromePossible);
        }

        static boolean checkPalindromePossibility(String str){
            Map<Character, Integer> charCount = new HashMap<>();
            char[] arr = str.toCharArray();
            for (int i= 0; i<arr.length; i++) {
                if(charCount.containsKey(arr[i])){
               int count = charCount.get(arr[i]);
               charCount.put(arr[i], count+1);
;              }
                else {
                    charCount.put(arr[i], 1);
                }
            }


            Set<Character> keys = charCount.keySet();
            boolean haveMoreThan1CharHvingCount1 = false;
            for(Character ch: keys){
                int count = charCount.get(ch);
                if(count>1) {
                    return false;
                }
                if(count == 1 && haveMoreThan1CharHvingCount1)
                    return true;
            }
            return false;
        }
    }








