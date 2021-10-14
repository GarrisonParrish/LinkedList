import org.junit.Test;

import static org.junit.Assert.*;

public class TestJunit {
    @Test
    public void testNode() {
        ListNode n = new ListNode(1);
        n.appendToEnd(2);
        n.appendToEnd(3);

        LinkedList l = new LinkedList(1);
        l.append(2);
        l.append(3);

        assertEquals(l.getHead().getVal(), n.getVal());
    }

    @Test
    public void testDeleteNode() {
        ListNode n = new ListNode(1);
        n.appendToEnd(2);
        n.appendToEnd(3);
        n.appendToEnd(4);

        // 1 -> 2 -> 3 -> 4
        // 1 -> 2 ------> 4

        n.deleteNode(n,3);  // this seems a little redundant
        assertEquals(-1, n.getIndex(3));  // does not exist
        assertEquals(2, n.getIndex(4));  // "index" starting from 0 is 2
    }

    @Test
    public void testDeleteDuplicatesUnsorted01() {
        ListNode head = new ListNode(1);
        head.appendToEnd(2);
        head.appendToEnd(3);
        head.appendToEnd(2);

        // 1 -> 2 -> 3 -> 2
        // remove dups
        // 1 -> 3
        ListNode result = RemoveDupsUnsorted.deleteDuplicatesUnsorted(head);
        assertEquals(0, result.getIndex(1));  // 1 at index 0
        assertEquals(1, result.getIndex(3));  // 3 at index 1
    }

    @Test
    public void testDeleteDuplicatesUnsorted02() {
        ListNode head = new ListNode(3);
        head.appendToEnd(2);
        head.appendToEnd(2);
        head.appendToEnd(1);
        head.appendToEnd(3);
        head.appendToEnd(2);
        head.appendToEnd(4);

        // 3 -> 2 -> 2 -> 1 -> 3 -> 2 -> 4
        // remove dups {3, 2}
        // 1 -> 4
        ListNode result = RemoveDupsUnsorted.deleteDuplicatesUnsorted(head);
        assertEquals(0, result.getIndex(1));  // 1 at index 0
        assertEquals(1, result.getIndex(4));  // 4 at index 1
    }
}