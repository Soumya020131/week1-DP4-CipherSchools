import java.util.*;
public class DuplicateParenthesis {
    public static boolean checkDuplicateParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ')'){
                stack.push(str.charAt(i));
            }else{
                if(stack.peek() == '('){
                    return true;
                }else{
                    while(stack.peek() != '('){
                        stack.pop();
                    }
                    stack.pop();
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+(b))+3)";
        System.out.println(checkDuplicateParenthesis(str));
    }
    
}
