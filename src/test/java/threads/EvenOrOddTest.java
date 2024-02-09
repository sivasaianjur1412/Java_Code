package threads;

import org.junit.Assert;
import org.junit.Test;

public class EvenOrOddTest {
    EvenOrOdd evenOrOdd = new EvenOrOdd();
    @Test
    public void testEvenOrOdd() {
        Assert.assertEquals(4, (int) evenOrOdd.getEvenOdd(10)
                .get(3));
    }
}
