package arrays;

public class ReverseArray {

    /***
     * Finding reverse of an array
     * @param arr
     * @return
     */
    static int[] findingReverse(int[] arr) {
        int[] reverse = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            reverse[i] = arr[arr.length - i - 1];
        }
        return reverse;
    }
    public static void main(String[] args) {
        int[] arr = {12, 47, 20, 92, 75};
        arr = findingReverse(arr);
        for(int i : arr) {
            System.out.print(i + ", ");
        }
    }
}
