package collections;

import org.junit.Assert;
import org.junit.Test;
import java.util.Map;
public class MapOperationsTest {

    MapOperations mapOperations = new MapOperations();

    /***
     * Success case
     * Checked with all the words and working fine.
     */
    @Test
    public void testGetCharacterCountSuccess() {
        Map<Character, Integer> map = mapOperations.getCharacterCount("test string");
        Assert.assertEquals(3, map.get('t').intValue());
        Assert.assertEquals(1, map.get('e').intValue());
        Assert.assertEquals(2, map.get('s').intValue());
    }

    /***
     * Failure case
     * Given the empty string.
     * Checking by giving wrong expected value.
     */
    @Test
    public void testGetCharacterCountFailure() {
        Map<Character, Integer> map = mapOperations.getCharacterCount("a");
        Assert.assertNotEquals(2, map.get('a').intValue());
        map.remove('a');
        Assert.assertTrue(map.isEmpty());
    }

    /***
     * Success case
     * Giving the correct expected output.
     */
    @Test
    public void testGetIndicesOfTargetSuccess() {
        int[] array = {10, 20, 30, 40, 50, 60};
        int target = 100;
        int[] expectedOutputArray = {3, 5};
        int[] outputArray = mapOperations.getIndicesOfTargetSum(array, target);
        Assert.assertArrayEquals(expectedOutputArray, outputArray);
    }

    /***
     * Failure case
     * Checking with the wrong input
     */
    @Test
    public void testGetIndicesOfTargetFailure() {
        int[] array = {10, 20, 30, 40, 50};
        int target = 100;
        int length = mapOperations.getIndicesOfTargetSum(array, target).length;
        Assert.assertEquals(0, length);
    }

}
