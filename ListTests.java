import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
    @Test
    public void testFilter() {
        StringChecker sc = new StringChecker() {

        };
        String[] input1 = { "hi", "my", "name", "is" };
        ListExamples.filter(input1, sc);
        assertArrayEquals(new String[3], input1);
    }

}
