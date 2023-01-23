import java.util.*;

public class PeopleMeetEachOther{

    public static boolean isMeet(int p1, int p2, int s1, int s2){
        if((p1 > p2 && s1 > s2) || (p1 < p2 && s1 < s2)){
            return false;
        }
        while(p1 >= p2){
            if(p1 == p2){
                return true;
            }
            p1 = p1 + s1;
            p2 = p2 + s2;
        }

        return false;
    }

    public static boolean isMeetOptimized(int p1, int p2, int s1, int s2){
        if((p1 > p2 && s1 > s2) || (p1 < p2 && s1 < s2)){
            return false;
        }
        int Distance = Math.abs(p1 - p2);
        int Speed = Math.abs(s1 - s2);
        if(Distance % Speed == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int p1 = 6;
        int p2 = 4;
        int s1 = 6;
        int s2 = 8;
        
        boolean ans = isMeetOptimized(p1, p2, s1, s2);
        if(ans){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}