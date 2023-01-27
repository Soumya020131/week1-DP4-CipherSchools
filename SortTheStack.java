import java.util.Stack;
public class SortTheStack {
    public static Stack<Integer> sortStack(Stack<Integer> s){
        if(s.size() == 0){
            return s;
        }
        int temp = s.pop();
        sortStack(s);
        insert(s, temp);
        return s;
    }
    public static void insert(Stack<Integer> s, int temp){
        if(s.size() == 0 || s.peek() >= temp){
            s.push(temp);
            return;
        }
        int val = s.pop();
        insert(s, temp);
        s.push(val);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(7);
        s.push(1);
        s = sortStack(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    
}
