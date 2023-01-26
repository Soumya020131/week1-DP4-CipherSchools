public class LargestNumberAfterKSwaps {
    static String max = "0";
    public static void findLargestNumber(String str, int k){
        if(k == 0){
            
            return;
        }
        if(Integer.parseInt(str) > Integer.parseInt(max)){
            max = str;
        }
        int n = str.length();
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(str.charAt(i) < str.charAt(j)){
                    str = swap(str, i, j);
                    /*if(str1.compareTo(max) > 0){
                        max = str1;
                    }*/
                    findLargestNumber(str, k - 1);
                }
            }
        }
    }
    public static String swap(String str, int i, int j){
        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        String str = "25143";
        int k = 3;
        findLargestNumber(str, k);
        System.out.println(max);
    }

    
}
