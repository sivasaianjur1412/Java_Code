package arrays;

public class MovingZeroes {

    /***
     * Moving the zeroes to end
     * 1. check whether the zeroes are
     * @param arr
     */
    static void moveZeroesToEnd(int[] arr) {
        int zeroesCount = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0)
                zeroesCount++;
            else if(zeroesCount > 0){
                int tempValue = arr[i];
                arr[i] = 0;
                arr[i - zeroesCount] = tempValue;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 0, 5, 0, 8, 0};
        moveZeroesToEnd(arr);
        for(int i : arr) {
            System.out.print(i + ", ");
        }
    }
}
