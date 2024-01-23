package arrays;

public class SelectionSort {

    /***
     * finding the minimum and swap with the element.
     * @param arr
     */
    static void selectionSortAlgorithm(int[] arr) {
        for(int i = 0; i <= arr.length - 2; i++) {
            int minimum = i;
            for(int j = i; j <= arr.length - 1; j++) {
                if(arr[j] < arr[minimum])
                    minimum = j;
            }

            //Swapping the minimum with element.
            int tempValue = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = tempValue;
        }
    }


    public static void main(String[] args) {
        int[] arr = {12, 47, 20, 92, 75};
        selectionSortAlgorithm(arr);
        for(int i : arr) {
            System.out.print(i + ", ");
        }
    }
}
