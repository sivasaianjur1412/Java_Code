package arrays;

public class LargestAndSmallest {

    /***
     * Finding the maximum and minimum element in the array.
     * @param arr
     * @return
     */
    static int[] findingMinAndMax(int[] arr) {
        int minimum = arr[0], maximum = arr[0];
        for (int i : arr) {
            if (i > maximum)
                maximum = i;
            else if (i < minimum)
                minimum = i;
        }
        return new int[]{minimum, maximum};
    }
    public static void main(String[] args) {
        int[] arr = {77, 12, 47, 20, 92, 75};
        int[] minAndMax = findingMinAndMax(arr);
        for(int i : minAndMax)
            System.out.print(i + ", ");
    }
}
