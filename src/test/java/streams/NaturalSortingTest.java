package streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class NaturalSortingTest {
    NaturalSorting naturalSorting = new NaturalSorting();
    @Test
    public void testNaturalSuccess() {
        Assert.assertEquals("siva", naturalSorting.getMaximumElement(List.of("siva", "sai", "anjuri")));
    }
}
