package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;

public class GroupingList {

    public Map<Integer, List<String>> getListGroupByLength(List<String> stringList) {
        Map<Integer, List<String>> integerListMap = new HashMap<>();
        stringList.forEach(string -> {
            List<String> list = integerListMap.getOrDefault(string.length(), new ArrayList<>());
            list.add(string);
            integerListMap.put(string.length(), list);
        });
        return integerListMap;
    }
}
