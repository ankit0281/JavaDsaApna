import java.util.*;

public class reversenumber {
    public static void main(String agrs[]){
        int n = 171022;

        while(n > 0){
            int lastDigit = n%10;
            System.out.print(lastDigit+" ");
            n = n/10;
        }
        System.out.println();
    }
}
