package com.reeta.basics;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordWithCount {
        public static void main(String[] args) {
            findduplicteword("Aveer is a kid Reeta is Mumy Aveer is a son of Arun Reeta is Mother of aveer");
            findduplicteword("Reeta sister mamta rajat is brother of reeta mamta is a sister of mamta ");
        }
        public static void findduplicteword(String s ){
            String[] words = s.toLowerCase().split(" ");
            HashMap<String,Integer> wordcount= new HashMap<>();
            for (String word:words ){
                if (wordcount.containsKey(word)){
                    wordcount.put(word.toLowerCase(),wordcount.get(word)+1);
                }else
                    {
                        wordcount.put(word, 1);
                    }
                }
            Set<String> wordsinstring = wordcount.keySet();
            for (String word: wordsinstring){
             if(wordcount.get(word)>1){
                 System.out.println(word +  ":  " + wordcount.get(word) );
             }
            }
        }
    }



