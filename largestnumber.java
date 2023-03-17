import java.util.*;
//Largest Number in Array

public class largestnumber {
    public static int getLargest(int numbers){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(Strings args[]) {
        int numbers[] = {1,2,6,3,5};
        System.out.println("the largest number": + getLargest(numbers));
    }
    
}
