public class ReverseLinkedList {
    public static Node reverseLinkedList(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node smallHead = reverseLinkedList(head.next);
        Node tail = head.next;
        tail.next = head;
        head.next = null;
        return smallHead;
    }

    public static Node reverseLinkedListIterative(Node head){
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
        Node head = NodeUse.createRandomLinkedList(5);
        NodeUse.print(head);
        head = reverseLinkedList(head);
        NodeUse.print(head);
    }
    
}
