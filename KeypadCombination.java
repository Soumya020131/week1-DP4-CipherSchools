public class KeypadCombination {
    public static void printKeypad(int n, String output){
        if(n == 0){
            System.out.println(output);
            return;
        }
        int lastDigit = n % 10;
        String[] options = getOptions(lastDigit);
        for(int i = 0; i < options.length; i++){
            printKeypad(n / 10, options[i] + output);
        }
    }
    public static String[] getOptions(int n){
        if(n == 2){
            String[] options = {"a", "b", "c"};
            return options;
        }else if(n == 3){
            String[] options = {"d", "e", "f"};
            return options;
        }else if(n == 4){
            String[] options = {"g", "h", "i"};
            return options;
        }else if(n == 5){
            String[] options = {"j", "k", "l"};
            return options;
        }else if(n == 6){
            String[] options = {"m", "n", "o"};
            return options;
        }else if(n == 7){
            String[] options = {"p", "q", "r", "s"};
            return options;
        }else if(n == 8){
            String[] options = {"t", "u", "v"};
            return options;
        }else if(n == 9){
            String[] options = {"w", "x", "y", "z"};
            return options;
        }
        String[] options = {""};
        return options;
    }
    public static void main(String[] args) {
        int n = 23;
        printKeypad(n, "");
    }
    
}
