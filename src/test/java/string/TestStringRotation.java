package string;

import org.junit.Assert;
import org.junit.Test;


public class TestStringRotation {
    StringRotation stringRotation = new StringRotation();
    @Test
    public void testCheckRotation() {
        boolean output = stringRotation.checkStringRotation("JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee");
        Assert.assertTrue(output);
    }

    @Test
    public void testCheckRotationFailure() {
        Assert.assertFalse(stringRotation.checkStringRotation("JavaJ2eeStrutsHibernate", "JavaJ2eeStrutsHibernate"));
    }

    @Test
    public void testCheckEdgeCase() {
        Assert.assertFalse(stringRotation.checkStringRotation("Siva", "Saii"));
    }
}
