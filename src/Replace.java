import java.io.*;
import java.util.*;
import java.lang.Math;
public class Replace {
    static void modify(int arr[], int n) {
        //check if array size is less than 1 or equal to 1, if yes, then return
        if (n <= 1)
            return;
        //store current value of arr[0] and update it by replacing
        int prev = arr[0];
        //update the first array element
        arr[0] = arr[0] * arr[1];
        //update rest of the elements in the array
        for (int i = 1; i < n - 1; i ++) {
            //store the current element for the next replacement
            int curr = arr[i];
            //update current value using the previous value and the next value
            arr[i] = prev * arr[i + 1];
            //update the previous value
            prev = curr;
        }
        //update the last array element
        arr[n - 1] = prev * arr[n - 1];
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 5, 6};
        int n = arr.length;
        modify(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "");
        }
    }
}




