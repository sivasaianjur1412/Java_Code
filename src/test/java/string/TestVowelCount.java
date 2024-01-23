package string;

import org.junit.Assert;
import org.junit.Test;

public class TestVowelCount {
    StringVowels stringVowels = new StringVowels();

    @Test
    public void testVowelCountSuccess() {
        Assert.assertEquals(2, stringVowels.findVowelsCount("hello"));
    }
    @Test
    public void testVowelCountFailure() {
        int outputCount = stringVowels.findVowelsCount("fly");
        Assert.assertNotEquals(1, outputCount);
    }
}
