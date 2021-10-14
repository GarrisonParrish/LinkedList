import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RemoveDupsUnsorted {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public static ListNode deleteDuplicatesUnsorted(ListNode head) {
        // Create a new empty ListNode
        // Create a HashMap to track if a repeat haas occurred
        // If an element hasn't been seen, add it to the new list
        // If it has been seen, skip it

        ListNode n = head;  // runner for original list
        ListNode resultHead = new ListNode();  // new list that values will be added to
        ListNode result = resultHead;
        HashMap<Integer, ListNode> seen = new HashMap<>();  // add values first time they are seen
        HashMap<Integer, ListNode> fixed = new HashMap<>();  // add values when they have been fixed

        while (n != null) {
            // want to add the first element to result if it exists
            if (!seen.containsKey(n.val)) {
                // add to result and seen
                seen.put(n.val, new ListNode(n.val));
                seen.get();
                result.next = new ListNode(n.val);
                result = result.next;  // move to next item in result
            }
            n = n.next;
        }
        return result;
    }

    public static ListNode deleteDuplicatesUnsortedOld(ListNode head) {
        // make a HashSet with all values that repeat more than once
        Set<Integer> repeats = new HashSet<>();
        ListNode n = head;
        // find all values that appear more than once
        while (n.next != null) {
            ListNode a = n.next;
            while (a != null) {
                if (a.val == n.val) {
                    repeats.add(a.val);
                }
                a = a.next;
            }
            n = n.next;
        }

        ListNode m = head;
        // if head is a repeat
        while (m.next != null) {
            if (repeats.contains(m.next.val)) {
                m.next = m.next.next;  // remove node, could be null
            }
            if (m.next != null) {
                m = m.next;
            }
        }
        return head;
    }
}
