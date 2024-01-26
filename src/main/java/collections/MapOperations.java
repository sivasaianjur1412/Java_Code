package collections;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {
    /***
     * 1. Converted the string into character array and checked the condition.
     * Time complexity will be O(n)
     * @param input
     * @return
     */
    public Map<Character, Integer> getCharacterCount(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for(char character : input.toCharArray()) {
            if(map.containsKey(character))
                map.put(character, map.get(character) + 1);
            else
                map.put(character, 1);
        }
        return map;
    }


    /***
     * 1. Create a hashmap with the numbers and index.
     * 2. Target is subtracted from each of array in O(n).
     * 3. search the subtracted element from hash map in O(1).
     * Time complexity: O(n) * O(1) => O(n).
     *
     * @param numbers
     * @param sum
     * @return
     */
    public int[] getIndicesOfTargetSum(int[] numbers, int sum) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            if(hashMap.containsKey(sum - numbers[i]))
                return new int[]{hashMap.get(sum - numbers[i]), i};
            hashMap.put(numbers[i], i);
        }
        return new int[]{};
    }

}
