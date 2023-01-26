public class GenerateParenthesis {
    public static void generateParenthesis(int open, int close, String str){
        if(open == 0 && close == 0){
            System.out.println(str);
            return;
        }
        if(open != 0){
            String str1 = str + "(";
            generateParenthesis(open - 1, close, str1);
        }
        if(close > open){
            String str2 = str + ")";
            generateParenthesis(open, close - 1, str2);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        generateParenthesis(n, n, "");
    }
    
}
