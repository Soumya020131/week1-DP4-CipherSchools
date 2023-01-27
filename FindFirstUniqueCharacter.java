public class FindFirstUniqueCharacter {
    // find first unique character in a string using linked list
    public static int findFirstUniqueCharacter(String str){
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
                tail = newNode;
            }
        }
        DLLNode temp = head;
        while(temp != null){
            char ch = temp.data;
            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                return str.indexOf(ch);
            }
            temp = temp.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "abcbdef";
        System.out.println(findFirstUniqueCharacter(str));
    }
    
}
