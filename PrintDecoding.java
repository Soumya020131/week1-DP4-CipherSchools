public class PrintDecoding {
    public static void printDecoding(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        if(str.charAt(0) == '0'){
            return;
        }
        char ch = (char)('a' + str.charAt(0) - '1');
        printDecoding(str.substring(1), ans + ch);
        if(str.length() >= 2){
            int num = (str.charAt(0) - '0') * 10 + (str.charAt(1) - '0');
            if(num <= 26){
                ch = (char)('a' + num - 1);
                printDecoding(str.substring(2), ans + ch);
            }
        }
    }
    public static void main(String[] args) {
        String str = "23";
        printDecoding(str, "");
    }
    
}
