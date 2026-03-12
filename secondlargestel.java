// import java.util.Arrays;
// class Solution {
//     public static void getElements(int[] arr, int n) {
//         if (n == 0 || n == 1) {
//             System.out.println(-1 + " " + -1); 
//             return;
//         }
//         Arrays.sort(arr);
//         int small = arr[1];
//         int large = arr[n - 2];
//         System.out.println("Second smallest is " + small);
//         System.out.println("Second largest is " + large);
//     }
// }

// public class secondlargestel {

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 4, 6, 7, 5};
//         int n = arr.length;
//         Solution.getElements(arr, n);   
//     }
// } //TC: o(n log n) and SC: o(1)

//better approach
// class Solution {
//     public static void getElements(int[] arr, int n) {
//         if (n == 0 || n == 1) {
//             System.out.println(-1 + " " + -1); 
//             return;
//         }
//         int small = Integer.MAX_VALUE, second_small = Integer.MAX_VALUE;
//         int large = Integer.MIN_VALUE, second_large = Integer.MIN_VALUE;

//         for (int i = 0; i < n; i++) {
//             small = Math.min(small, arr[i]);  
//             large = Math.max(large, arr[i]);  
//         }

//         for (int i = 0; i < n; i++) {
//             if (arr[i] < second_small && arr[i] != small) {
//                 second_small = arr[i];  
//             }
//             if (arr[i] > second_large && arr[i] != large) {
//                 second_large = arr[i];  
//             }
//         }
//         System.out.println("Second smallest is " + second_small);
//         System.out.println("Second largest is " + second_large);
//     }
// }

// public class secondlargestel {
//     public static void main(String[] args) {
//         int n = 6;
//         int[] arr = {1, 2, 4, 6, 7, 5};  
//         Solution.getElements(arr, n);
//     }
// } //TC: o(n) and SC: o(1)

//optimal approach
class Solution {
    public static int secondSmallest(int[] arr, int n) {
        if (n < 2)
            return -1;
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                second_small = small;
                small = arr[i];
            } 
            else if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
        }
        return second_small; 
    }

    public static int secondLargest(int[] arr, int n) {
        if (n < 2)
            return -1;

        int large = Integer.MIN_VALUE, second_large = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            } 
            else if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        return second_large; 
    }
}

public class secondlargestel {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        int n = arr.length;
        int sS = Solution.secondSmallest(arr, n);
        int sL = Solution.secondLargest(arr, n);
        System.out.println("Second smallest is " + sS);
        System.out.println("Second largest is " + sL);
    }
} //TC: o(n) and SC: o(1)