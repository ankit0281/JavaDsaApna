public class SortedArray {
    public static void printDec(int n) {
        if(n == 1){
            System.out.println(n);
            return;

        }
    }
    
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i);

        public static void main(String args[]){
            int arr[] = {1,2,3,7,6};
            System.out.println(isSorted(arr,0));
        }
    }
}
