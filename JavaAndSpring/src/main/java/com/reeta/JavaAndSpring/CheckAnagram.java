package com.reeta.basics;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagram
{

    public static void main(String[] args) {
        String s= "racecar";
        String t = "carrace";
        boolean result = isAnagram2(s,  t);
        System.out.println(result);
    }

    public static boolean isAnagram2(String s, String t) {

        if (s.length() != t.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!map.containsKey(c)) {
                return false;
            }

            map.put(c, map.get(c) - 1);

            if (map.get(c) == 0) {
                map.remove(c);
            }
        }

}
