//arrays class

import java.util.Arrays;

public class P07 {
    public static void main(String[] args) {
        int arr[] = {1,85,85,65,6,45,5};
        System.out.println(Arrays.toString(arr));
        //Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 85));
        
    }
}
