package string;

import org.junit.Assert;
import org.junit.Test;

public class TestAnagrams {
    Anagrams anagrams = new Anagrams();
    @Test
    public void testStringAnagrams() {
        boolean isAnagram = anagrams.checkAnagram("siva", "avis");
        Assert.assertTrue(isAnagram);
    }


    @Test
    public void testStringAnagrams_Failure() {
        boolean isAnagram = anagrams.checkAnagram("shiva", "sivas");
        Assert.assertFalse(isAnagram);
    }

    @Test
    public void testStringAnagramsWithLength() {
        boolean isAnagram = anagrams.checkAnagram("siva", "avi");
        Assert.assertFalse(isAnagram);
    }

    /***
     * Edge cases for this scenario
     * 1. If the strings are empty.
     * 2. If the string length is not same.
     */
    @Test
    public void testStringAnagramEdgeCase() {
        Anagrams anagrams = new Anagrams();
        boolean isAnagram = anagrams.checkAnagram("", "");
        Assert.assertTrue(isAnagram);
    }
}
