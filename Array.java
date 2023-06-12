import java.util.*;

public class Array {
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 3;
        }
    }
    public static void main(String args[]){
        int marks[] = {96,98,99};

        //print our marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
        
}