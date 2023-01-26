public class FactUsingTailCall {
    public static int factUsingTailCall(int number, int ans){
        if(number == 1){
            return ans;
        }
        return factUsingTailCall(number - 1, number * ans);
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println(factUsingTailCall(number, 1));
    }
    
}
