package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOperations {
    public Set<String> getDataUsingForLoop(HashSet<String> hashSet) {
        Set<String> stringSet = new HashSet<>();
        for(String string : hashSet)
            stringSet.add(string);
        return stringSet;
    }

    public Set<String> getDataUsingIterator(HashSet<String> hashSet) {
        Set<String> stringSet = new HashSet<>();
        Iterator<String> stringIterator = hashSet.iterator();
        while(stringIterator.hasNext())
            stringSet.add(stringIterator.next());
        return stringSet;
    }

    public Set<String> getDataUsingEnhancedForLoop(HashSet<String> hashSet) {
        Set<String> stringSet = new HashSet<>();
        for(String s : hashSet)
            stringSet.add(s);
        return stringSet;
    }

}
