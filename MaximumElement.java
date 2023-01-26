public class MaximumElement {

    public static int findMaximum(int[] arr, int index){
        if(index < 0){
            return Integer.MIN_VALUE;
        }
        int temp = findMaximum(arr, index - 1);
        int max = Math.max(temp, arr[index]);

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(findMaximum(arr, arr.length - 1));
    }
    
}
