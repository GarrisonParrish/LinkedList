public class Main {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        n1.appendToEnd(2);
        n1.appendToEnd(3);

        while (n1 != null) {
            System.out.println(n1.val);
            n1 = n1.next;
        }
    }
}
