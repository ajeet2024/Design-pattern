package com.ajeet.String;

import java.util.Arrays;

public class AnagramCheck {

    public static boolean isAnagram(String a, String b) {
        a = a.replaceAll("\\s+", "").toLowerCase();
        b = b.replaceAll("\\s+", "").toLowerCase();
        if(a.length() != b.length()){
            return false;

        }
        //convert array
        char[] charArray1 = a.toLowerCase().toCharArray();
        char[] charArray2 = b.toLowerCase().toCharArray();

        //sort the array
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));

    }
}
