import java.util.Stack;
public class LargestAreaHistogram {
    public static int largestAreaHistogram(int[] arr){
        int maxArea = 0;
        int area = 0;
        int i = 0;
        Stack<Integer> stack = new Stack<>();
        while(i < arr.length){
            if(stack.isEmpty() || arr[stack.peek()] <= arr[i]){
                stack.push(i);
                i++;
            }else{
                int top = stack.pop();
                if(stack.isEmpty()){
                    area = arr[top] * i;
                }else{
                    area = arr[top] * (i - stack.peek() - 1);
                }
                if(area > maxArea){
                    maxArea = area;
                }
            }
        }
        while(!stack.isEmpty()){
            int top = stack.pop();
            if(stack.isEmpty()){
                area = arr[top] * i;
            }else{
                area = arr[top] * (i - stack.peek() - 1);
            }
            if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 5, 1, 6};
        System.out.println(largestAreaHistogram(arr));
    }
    
}
