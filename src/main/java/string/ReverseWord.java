package string;

public class ReverseWord {

    /***
     * Reverse of a words separated with space.
     * @param input
     * @return
     */
    public String checkReverseOfEachWord(String input) {


        String[] stringArray = input.split(" ");
        String reverse = "";
        for(String word : stringArray) {
            StringBuilder stringBuilder = new StringBuilder(word);
            stringBuilder.reverse();
            reverse +=stringBuilder.toString() + " ";
        }
        return reverse.trim();
    }

}
