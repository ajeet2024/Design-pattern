package com.ajeet.String;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringLength {

    public static int longestSubstringLength(String s) {
        Set<Character> set  = new HashSet<Character>();
        int left = 0, right = 0;
        int max = 0;
        while (right < s.length()) {
            if(!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                max = Math.max(max, right - left+1);
                right++;

            }else{
                set.remove(s.charAt(left));
                left++;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(longestSubstringLength(str));
    }
}
