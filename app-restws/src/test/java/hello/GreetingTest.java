package hello;

import org.junit.Assert;
import org.junit.Test;

public class GreetingTest {
    @Test
    public void constructionTest() {
        Greeting greeting = new Greeting(1, "test");
        Assert.assertEquals(1, greeting.getId());
        Assert.assertEquals("test", greeting.getContent());
    }
}
