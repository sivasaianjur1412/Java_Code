package arrays;

public class LargestAndSmallest {

    /***
     * Finding the maximum and minimum element in the array.
     * @param arr
     * @return
     */
    public int[] findingMinAndMax(int[] arr) {
        if(arr.length == 0)
            return new int[]{0, 0};
        int minimum = arr[0], maximum = arr[0];
        for (int i : arr) {
            if (i > maximum)
                maximum = i;
            else if (i < minimum)
                minimum = i;
        }
        return new int[]{minimum, maximum};
    }
}
