package string;

import java.util.Arrays;

public class Anagrams {
    /***
     * Checks Anagram
     * 1. Sort both the character arrays and check both are equal or not.
     * @param stringOne
     * @param stringTwo
     * @return
     */
    public boolean checkAnagram(String stringOne, String stringTwo) {
        char[] charOne = stringOne.toCharArray();
        char[] charTwo = stringTwo.toCharArray();
        if(charOne.length != charTwo.length)
            return false;
        Arrays.sort(charOne);
        Arrays.sort(charTwo);
        for(int i = 0; i < charOne.length; i++) {
            if(charOne[i] != charTwo[i])
                return false;
        }
        return true;
    }
}
