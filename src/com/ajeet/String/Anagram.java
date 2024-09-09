package com.ajeet.String;

import java.util.*;

public class Anagram {
    public static List<List<String>> groupAnagrams(List<String> words) {
        // A map where the key is the sorted word, and the value is a list of anagrams
        Map<String, List<String>> anagramMap = new HashMap<>();

        // Iterate over each word
        for (String word : words) {
            // Convert the word to a character array, sort it, and convert it back to a string
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // Get the list of anagrams for the sorted word
            List<String> anagramList = anagramMap.getOrDefault(sortedWord, new ArrayList<>());
            // Add the current word to the list
            anagramList.add(word);
            // Put the updated list back into the map
            anagramMap.put(sortedWord, anagramList);
        }

        // Return the values of the map as a list of lists
        return new ArrayList<>(anagramMap.values());
    }


    public static void main(String[] args) {

        List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        List<List<String>> groupedAnagrams = groupAnagrams(words);

        // Print the grouped anagrams
        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }


    }
}
