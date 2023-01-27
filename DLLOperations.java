class DLLNode{
    char data;
    DLLNode next;
    DLLNode prev;
    DLLNode(char data){
        this.data = data;
    }
}
public class DLLOperations {
    public static DLLNode createDLL(String str){
        DLLNode head = null;
        DLLNode tail = null;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            DLLNode newNode = new DLLNode(ch);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
        return head;
    }
    public static void print(DLLNode head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void deleteNode(DLLNode head, char ch){
        DLLNode temp = head;
        while(temp != null){
            if(temp.data == ch){
                if(temp.prev == null){
                    head = temp.next;
                    head.prev = null;
                }else if(temp.next == null){
                    temp.prev.next = null;
                }else{
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
            }
            temp = temp.next;
        }
    }

    public static void appendNode(DLLNode head, char ch){
        DLLNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        DLLNode newNode = new DLLNode(ch);
        temp.next = newNode;
        newNode.prev = temp;
    }
    
}
