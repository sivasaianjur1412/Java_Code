package string;

public class StringVowels {

    /***
     * Finds the vowel count in a string.
     * 1. Converting the total string in lower case and check whether are any vowels present or not.
     * 2. If true add a counter.
     * @param inputString
     * @return
     */
    public int findVowelsCount(String inputString) {
        inputString = inputString.toLowerCase();
        int count = 0;
        for(int i = 0; i < inputString.length(); i++) {
            if(inputString.charAt(i) == 'a' ||
                    inputString.charAt(i) == 'e' ||
                    inputString.charAt(i) == 'i' ||
                    inputString.charAt(i) == 'o' ||
                    inputString.charAt(i) == 'u')
                count++;
        }
        return count;
    }
}
