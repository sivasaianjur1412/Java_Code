package loopandconditions;

public class ReverseDigit {

    /***
     * eg: 12345
     * 10) 12345 ( 1234         10) 1234 (123          10) 123 (12         10) 12 (1        10) 1 (
     *     12340                    1230                   12                  10               1
     *     5                        4                      3                   2                0
     *
     * @param digit
     * @return
     */
    static int reverseDigit(int digit) {
        int reverseNumber = 0;
        while(digit > 0) {
           int remainder = digit % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            digit /= 10;
        }
        return reverseNumber;
    }
    public static void main(String[] args) {
        System.out.println(reverseDigit(12345));
    }
}
