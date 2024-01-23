package loopandconditions;

public class Pattern {

    /***
     *      + + + + - -
     *      + + + - - -
     *      + + - - - -
     *      + - - - - -
     *      - - - - - -
     * @param args
     */
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 0; i < rows; i++) {

        for(int j = 0; j < rows+1; j++) {
            if(i + j < rows - 1)
                System.out.print("+ ");
            else
                System.out.print("- ");
        }
            System.out.println(" ");
        }
    }
}
