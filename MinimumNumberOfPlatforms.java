public class MinimumNumberOfPlatforms {
    public static int minPlatforms(int[] arrival, int[] departure){
        int n = arrival.length;
        int platforms = 1;
        int result = 1;
        int i = 1;
        int j = 0;
        while(i < n && j < n){
            if(arrival[i] <= departure[j]){
                platforms++;
                i++;
                if(platforms > result){
                    result = platforms;
                }
            }
            else{
                platforms--;
                j++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arrival = { 900, 940, 950, 1100, 1500, 1800 };
        int[] departure = { 910, 1200, 1120, 1130, 1900, 2000 };
        System.out.println(minPlatforms(arrival, departure));
    } 
    
}
