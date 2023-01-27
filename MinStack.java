//import java.util.*;
public class MinStack {
    private Node head;
    private int size;
    public MinStack(){
        head = null;
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    public int pop() {
        if(size == 0){
           return -1;
        }
        int temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
    public int top(){
        if(size == 0){
            return -1;
        }
        return head.data;
    }
    public int min() {
        if(size == 0){
            return -1;
        }
        Node temp = head;
        int min = temp.data;
        while(temp != null){
            if(temp.data < min){
                min = temp.data;
            }
            temp = temp.next;
        }
        return min;
    }
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        System.out.println(stack.min());
        
    }
    
}
