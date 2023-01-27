public class RestructureLL {
    public static Node restructure(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);
        Node head1 = head;
        Node temp1 = null;
        Node temp2 = null;
        while(head1 != null && head2 != null){
            temp1 = head1.next;
            temp2 = head2.next;
            head1.next = head2;
            head2.next = temp1;
            head1 = temp1;
            head2 = temp2;
        }
        return head;
    }
    public static Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head = NodeUse.createRandomLinkedList(6);
        NodeUse.print(head);
        head = restructure(head);
        NodeUse.print(head);
    }
    
}
