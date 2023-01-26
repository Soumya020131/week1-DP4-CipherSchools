public class KSmallestElements {
    public static void keElements(int[] arr, int k){

        for(int index = k; index < arr.length; index++){
            int currentElement = arr[index];
            
            int max = arr[k - 1];
            int maxPosition = k - 1;
            for(int j = k - 2; j >= 0; j--){
                if(arr[j] > max){
                    max = arr[j];
                    maxPosition = j;
                }
            }
            if(currentElement < max){
                while(maxPosition < k - 1){
                    arr[maxPosition] = arr[maxPosition + 1];
                    maxPosition++;
                }
                arr[k - 1] = arr[index];
            }
        }
        for(int i = 0; i < k; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 3, 20, 15 };
        int k = 3;
        //int n = arr.length;
        System.out.println("K smallest elements are");
        keElements(arr, k);
    }
    
}
