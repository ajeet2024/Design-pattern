package com.ajeet.String;

public class LongestPalindromeSubstring {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            // Check for longest odd-length palindrome centered at i
            String oddPalindrome = expandAroundCenter(s, i, i);
            if (oddPalindrome.length() > longest.length()) {
                longest = oddPalindrome;
            }

            // Check for longest even-length palindrome centered between i and i+1
            String evenPalindrome = expandAroundCenter(s, i, i + 1);
            if (evenPalindrome.length() > longest.length()) {
                longest = evenPalindrome;
            }
        }
        return longest;

    }
    private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // Note that s.substring(left + 1, right) gives the palindromic substring
        return s.substring(left + 1, right);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));

    }
}











