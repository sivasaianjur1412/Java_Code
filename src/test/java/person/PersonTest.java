package person;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testPersonData() {
        Person[] persons = {
                new Person(6.3, 70.2, "100-200-1567", 15000),
                new Person(7.2, 55.4, "100-200-1567", 25000),
                new Person(5.2, 45.8, "350-420-7066", 10000)
        };
        boolean output = persons[0].equals(persons[1]);
        Assert.assertTrue(output);
    }
}
