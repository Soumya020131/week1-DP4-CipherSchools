//import java.util.*;
public class MergeKLinkedList {
    public static Node merge2lists(Node l1, Node l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        Node temp = new Node();
        Node merged = temp;

        while(l1 != null && l2 != null){
            if(l1.data <= l2.data){
                merged.next = l1;
                merged = l1;
                l1 = l1.next;
            }
            else if(l2.data < l1.data){
                merged.next = l2;
                merged = l2;
                l2 = l2.next;
            }
            

        }
        while(l1 != null){
            merged.next = l1;
            merged = l1;
            l1 = l1.next;

        }
        while(l2 != null){
            merged.next = l2;
            merged = l2;
            l2 = l2.next;

        }
        //System.out.println("temp.next.data: " + temp);
        return temp.next;

    }
    public static Node mergeKLists(Node[] lists) {
        if(lists.length == 0){
            return null;
        }
        for(int i = 1; i < lists.length; i++){
            lists[0] = merge2lists(lists[0], lists[i]);
        }
        return lists[0];
    }
    public static void main(String[] args) {
        Node[] heads = new Node[3];
        Node node1 = new Node(1);
        node1.next = new Node(2);
        node1.next.next = new Node(3);
        Node node2 = new Node(4);
        node2.next = new Node(8);
        node2.next.next = new Node(10);
        Node node3 = new Node(1);
        node3.next = new Node(3);
        node3.next.next = new Node(4);
        heads[0] = node1;
        heads[1] = node2;
        heads[2] = node3;
        NodeUse.print(heads[0]);
        NodeUse.print(heads[1]);
        NodeUse.print(heads[2]);
        Node head = mergeKLists(heads);
        NodeUse.print(head);
    }
    
}
