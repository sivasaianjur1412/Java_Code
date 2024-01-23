package arrays;

public class RotateArray {

    /***
     * Rotation of an array
     * @param arr
     * @param position
     * @return
     */

    static int[] rotateArrayByPosition(int[] arr, int position) {
        int[] newArray = new int[arr.length];
        int flag = position;
        for(int i = 0; i < arr.length; i++) {
            if(position > 0) {
                newArray[arr.length - position] = arr[i];
                position--;
            }
            else {
                newArray[i - flag] = arr[i];
            }

        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int position = 2;
        arr = rotateArrayByPosition(arr, position);
        for(int i : arr) {
            System.out.print(i + ", ");
        }
    }
}
