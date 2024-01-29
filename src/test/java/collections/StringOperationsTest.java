package collections;

import org.junit.Assert;
import org.junit.Test;

public class StringOperationsTest {
    StringOperations stringOperations = new StringOperations();

    /***
     * Success Case
     * We are giving a string containing duplicates
     */
    @Test
    public void testRemoveDuplicates() {
        String outputString = stringOperations.removeDuplicates("Hello");
        Assert.assertEquals("Helo", outputString);
    }

    /***
     * Failure case
     * We are giving an empty string
     */
    @Test
    public void testRemoveDuplicatesFailure() {
        String outputString = stringOperations.removeDuplicates("");
        Assert.assertTrue(outputString.isEmpty());
    }

    /***
     * Edge case
     * 1. No duplicates.
     * 2. Identical characters in a string.
     * 3. Special characters in a string.
     */
    @Test
    public void testRemoveDuplicatesEdgeCase() {
        //giving string with no duplicates
        String outputString = stringOperations.removeDuplicates("siva");
        Assert.assertEquals("siva", outputString);
        //giving string with all identical characters.
        outputString = stringOperations.removeDuplicates("iiii");
        Assert.assertEquals("i", outputString);
        //giving string with special characters
        outputString = stringOperations.removeDuplicates("$hiv@ $ai");
        Assert.assertEquals("$hiv@ a", outputString);
    }
}
