import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testEmptyLength() {
        LinkedList ll = new LinkedList();
        assertEquals(0, ll.length());
    }

    @Test
    public void testPrepend() {
        LinkedList ll = new LinkedList();
        ll.prepend(10);
        assertEquals(1, ll.length());
        assertEquals(10, ll.first());
        assertEquals(10, ll.last());
        ll.prepend(4);
        assertEquals(2, ll.length());
        assertEquals(4, ll.first());
        assertEquals(10, ll.last());

    }

    @Test
    public void testAppend() {
        LinkedList ll = new LinkedList();
        ll.append(10);
        ll.append(5);
        assertEquals(2, ll.length());
        assertEquals(10, ll.first());
        assertEquals(5, ll.last());

    }

    @Test
    public void testAppendMany() {
        LinkedList ll = new LinkedList();
        ll.append(10);
        ll.append(5);

        ll.append(18);
        assertEquals(3, ll.length());
        assertEquals(10, ll.first());
        assertEquals(18, ll.last());

    }

    @Test
    public void testPrependAppend() {
        LinkedList ll = new LinkedList();
        ll.append(10);
        ll.append(5);
        assertEquals(2, ll.length());
        assertEquals(10, ll.first());
        assertEquals(5, ll.last());
        ll.prepend(4);
        assertEquals(3, ll.length());
        assertEquals(4, ll.first());
        assertEquals(5, ll.last());

    }

    @Test
    public void testToString() {
        String ll_out = "10 5 ";
        LinkedList ll = new LinkedList();
        ll.append(10);
        ll.append(5);
        assertEquals(2, ll.length());
        assertEquals(ll_out, ll.toString());

    }
}
