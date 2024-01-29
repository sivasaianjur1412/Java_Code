package collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOperationsTest {

    SetOperations setOperations = new SetOperations();
    @Test
    public void testGetDataSuccess() {
        HashSet<String> hashSet = createHashSet();
        Set<String> outputSet = setOperations.getDataUsingForLoop(hashSet);
        int length = outputSet.size();
        Assert.assertEquals(length, 10);
    }

    @Test
    public void testLoopWithEmptySet() {
        HashSet<String> set = new HashSet<>();
        Set<String> outputSet = setOperations.getDataUsingIterator(set);
        Iterator<String> iterator = outputSet.iterator();
        Assert.assertFalse(iterator.hasNext());

        set = createHashSet();
        outputSet = setOperations.getDataUsingIterator(set);
        Assert.assertNotNull(outputSet);
    }

    @Test
    public void testForEach() {
        HashSet<String> set = createHashSet();
        Set<String> outputSet = setOperations.getDataUsingEnhancedForLoop(set);
        Assert.assertFalse(outputSet.isEmpty());
    }

    public HashSet<String> createHashSet() {
        HashSet<String> inputSet = new HashSet<>();
        for(int i = 1; i <= 10; i++)
            inputSet.add("Input" + i);
        return inputSet;
    }
}
