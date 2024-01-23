package arrays;

public class SearchAlgorithm {


    /***
     * Linear search algorithm.
     * @param arr
     * @param searchElement
     * @return
     */
    static int linearSearch(int[] arr, int searchElement) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == searchElement)
                return i;
        }
        return -1;
    }

    /***
     * Binary search algorithm
     * @param arr
     * @param searchElement
     * @return
     */
    static int binarySearch(int[] arr, int searchElement) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            int midValue = (low + high) / 2;
            if(arr[midValue] == searchElement)
                return midValue;
            else if(arr[midValue] < searchElement)
                low = midValue + 1;
            else if(arr[midValue] > searchElement)
                high = midValue - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 20, 24, 47, 75, 92};
        int searchElement = 47;
        int index = binarySearch(arr, searchElement);
        //index = linearSearch(arr, searchElement);
        if(index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at position " + (index + 1));
    }
}
