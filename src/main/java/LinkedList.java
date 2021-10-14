public class LinkedList {
    // Wraps ListNode, allows us to change the head
    public ListNode head = null;

    public LinkedList(int d) {
        // implement a LinkedList given data
        this.head = new ListNode(d);
    }

    public void append(int d) {
        head.appendToEnd(d);  // call ListNode.appendToEnd() method to add data to end of list
    }

    public ListNode getHead() {
        return head;
    }
}
