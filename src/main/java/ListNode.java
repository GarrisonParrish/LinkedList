public class ListNode {
    public ListNode next = null;
    public int val;

    public ListNode(){};  // weird
    public ListNode(int d) {
        this.val = d;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void appendToEnd(int d) {
        ListNode end = new ListNode(d);
        ListNode n = this;
        while (n.next != null) {
            n = n.next;  // iterate through nodes until we reach the last non-null ones
        }
        n.next = end;  // replace the null pointer with end
        // concern: access modifiers
    }

    public ListNode getHead() {
        return this;
    }

    public int getVal() {
        return val;
    }

    public int getIndex(int d) {
        // Returns index of first element with value d in data
        int i = 0;
        if (this.val == d) {
            return i;  // index 0
        }
        ListNode n = this.next;
        i++;  // "incremented" to next node
        while (n != null) {
            if (n.val == d) {
                return i;
            }
            i++;
            n = n.next;
        }
        return -1;  // element not found
    }

    public ListNode deleteNode(ListNode head, int d) {
        // Given a value d, delete the first ListNode with the value in its data\
        if (head == null) {
            return null;
        }
        ListNode n = head;  // will perform operations on this one. Modifying n will modify head. n is a pointer.

        if (n.val == d) {
            return head.next;
        }

        while (n.next != null) {
            if (n.next.val == d) {
                n.next = n.next.next;  // could be null or a ListNode
                return head;  // n pointer has been changed, head still points to first element but d has been deleted
            }
            n = n.next;  // iterate otherwise
        }
        return head;  // we didn't find it
    }

}
