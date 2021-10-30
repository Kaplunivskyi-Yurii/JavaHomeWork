package com.pb.kaplunivskyi.hw4;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Anagram {
    public boolean myMethod(String firstWord, String secondWord){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        char[] word1 = str1.toCharArray();
        char[] word2 = str2.toCharArray();

        Map<Character, Integer> lettersInWord1 = new HashMap<Character, Integer>();

        for (char c : word1) {
            int count = 1;
            if (lettersInWord1.containsKey(c)) {
                count = lettersInWord1.get(c) + 1;
            }
            lettersInWord1.put(c, count);
        }
        for (char c :word2) {
            int count = -1;
            if (lettersInWord1.containsKey(c)) {
                count = lettersInWord1.get(c) - 1;
            }
            lettersInWord1.put(c, count);
        }
    }
}
