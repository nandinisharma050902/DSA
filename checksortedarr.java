// class Solution {
//     public boolean isSorted(int[] arr, int n) {
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[j] < arr[i]) 
//                     return false;
//             }
//         }
//         return true;
//     }
// }

// public class checksortedarr{
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int n = 5;
//         Solution obj = new Solution();
        
//         boolean ans = obj.isSorted(arr, n);
        
//         // Output result
//         if (ans) 
//             System.out.println("True");
//         else 
//             System.out.println("False");
//     }
// } //TC: o(n^2) and SC: o(1)

//optimal approach
class Solution {
    public boolean isSorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])  
                return false;
        }
        return true;
    }
}

public class checksortedarr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        Solution obj = new Solution();
        System.out.println(obj.isSorted(arr, n) ? "True" : "False");
    }
} //TC: o(n) and SC: o(1)