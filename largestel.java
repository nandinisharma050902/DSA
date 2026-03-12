//import java.util.Arrays;
// //brute force approach
// class Solution {
//     public static int sortArr(int[] arr) {
//         Arrays.sort(arr);
//         return arr[arr.length - 1];
//     }
// }
// public class largestel {

//     public static void main(String[] args) {
//         int[] arr1 = {2, 5, 1, 3, 0};
//         System.out.println("The Largest element in the array is: " + Solution.sortArr(arr1));
//     }
// } //TC:o(n log n) and SC: o(1)

//optimal approach
class Solution {
    public static int findLargestElement(int[] arr, int n) {
        int max = arr[0]; 
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {  
                max = arr[i];
            }
        }
     return max;
    }
}

public class largestel {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 1, 3, 0};
        int n = arr1.length; 
        int max = Solution.findLargestElement(arr1, n); 
        System.out.println("The largest element in the array is: " + max); 
    }
}