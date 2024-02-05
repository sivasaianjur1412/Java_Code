package streams;

import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {
    Addition addition = new Addition();
    @Test
    public void testAddition() {
        Assert.assertEquals(4, addition.mathOperation.operate(2, 2));
    }
}
