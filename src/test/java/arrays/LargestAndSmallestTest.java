package arrays;

import org.junit.Assert;
import org.junit.Test;

public class LargestAndSmallestTest {
    LargestAndSmallest largestAndSmallest = new LargestAndSmallest();
    @Test
    public void testMinAndMax() {
        int[] arr = {77, 12, 47, 20, 92, 75};
        int[] output = largestAndSmallest.findingMinAndMax(arr);
        Assert.assertArrayEquals(new int[]{12, 92}, output);
    }
    @Test
    public void testMinAndMaxFailure() {
        int[] arr = {};
        Assert.assertArrayEquals(new int[]{0, 0}, largestAndSmallest.findingMinAndMax(arr));
    }
}
