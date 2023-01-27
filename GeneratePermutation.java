import java.util.*;
public class GeneratePermutation {
    
        public static void generatePermutation(int[] arr, ArrayList<Integer> ans){
            if(ans.size() == arr.length){

                printArrayList(ans);

                return;
            }
            for(int i = 0; i < arr.length; i++){
                if(ans.contains(arr[i])){
                    continue;
                }else{

                    ans.add(arr[i]);
                    generatePermutation(arr, ans);
                    ans.remove(ans.size() - 1);
                }
            }
        }

        public static void printArrayList(ArrayList<Integer> ans){
            for(int i = 0; i < ans.size(); i++){
                System.out.print(ans.get(i) + " ");
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3};
            ArrayList<Integer> ans = new ArrayList<>();
            generatePermutation(arr, ans);
        }
    
}
