import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotEquals;

public class AssertExamplesTest {


    @Test
    public void assertEqualsNotEqualsTest() {
        String expectedText = "Test examples";
        String actualTextAsExpected = expectedText;
        String notExpectedText = "Test 123 Examples";

        assertEquals(expectedText, actualTextAsExpected);
        assertNotEquals(expectedText, notExpectedText);
    }
     @Test
    public void assertSubsting() {

        String expectedSubstring = "ples";
        String actualSubstring;


     }
}
