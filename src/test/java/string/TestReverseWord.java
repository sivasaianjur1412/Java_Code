package string;

import org.junit.Assert;
import org.junit.Test;

public class TestReverseWord {
    ReverseWord reverseWord = new ReverseWord();
    @Test
    public void testReverseWord() {
        String outputString = reverseWord.checkReverseOfEachWord("Java J2EE Reverse Me");
        Assert.assertEquals("avaJ EE2J esreveR eM", outputString);
    }

    @Test
    public void testReverseWordFailure() {
        String outputString = reverseWord.checkReverseOfEachWord(" ");
        Assert.assertNotEquals(" ", outputString);
    }


}
