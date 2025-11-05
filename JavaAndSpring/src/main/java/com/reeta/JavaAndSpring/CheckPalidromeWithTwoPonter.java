package com.reeta.twopointer;

public class CheckPalidromeWithTwoPonter
{
    public static void main(String[] args) {
        String s ="Was it a car or a cat I saw?" ;


        System.out.println(ispalidrome(s));

    }

    public static boolean ispalidrome(String s){

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0;
        int j = s.length()-1;

        while(i<=j){

            if(s.charAt(i)!= s.charAt(j)){
                return false;
            }
                i++;
                 j--;
        }
        return true;
    }
}
