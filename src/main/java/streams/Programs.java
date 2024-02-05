package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Programs {
    public List<String> getCapitalize(String[] stringArray) {

        return Arrays.stream(stringArray)
                .map(string -> string
                        .substring(0, 1)
                        .toUpperCase() +
                        string.substring(1))
                .sorted()
                .collect(Collectors.toList());
    }


    public double getAverageOfAllOdds(List<Integer> integerList) {
        OptionalDouble average = integerList.stream()
                .filter(number -> number % 2 != 0)
                .mapToInt(number -> number * number)
                .average();
        return average.isPresent() ? average.getAsDouble() : 0;
    }

}
