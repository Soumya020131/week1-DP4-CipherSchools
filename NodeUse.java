public class NodeUse {
    public static void print(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static Node createRandomLinkedList(int n){
        Node head = null;
        Node tail = null;
        for(int i = 0; i < n; i++){
            int data = (int)(Math.random() * 10);
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }
   
    public static void main(String args[]){
        Node node1 = new Node(10);
        Node node2 = new Node(20); 
        Node head = node1;
        node1.next = node2;
        print(head);
    }
    
}
