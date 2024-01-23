package loopandconditions;

public class FibonacciSeries {
    static void getFibonacci(int n){
        int a = 0, b = 1, c = 0;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }

    }
    public static void main(String[] args) {
        getFibonacci(10);
    }
}
