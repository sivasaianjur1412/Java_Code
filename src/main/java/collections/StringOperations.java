package collections;

import java.util.ArrayList;
import java.util.List;

public class StringOperations {
    public String removeDuplicates(String inputString) {
        List<Character> arrayList = new ArrayList<>();
        StringBuilder outputString = new StringBuilder();
        char[] array = inputString.toCharArray();
        for(Character character : array) {
            if(!arrayList.contains(character)) {
                arrayList.add(character);
                outputString.append(character);
            }
        }
        return outputString.toString();
    }
}
