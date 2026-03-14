// //brute force approach
// import java.util.Arrays;
// class Solution {
//     public void rotateRight(int[] arr, int k) {
//         int n = arr.length;
//         if (n == 0) return;
//         k = k % n;
//         int[] temp = Arrays.copyOfRange(arr, n - k, n);
//         for (int i = n - k - 1; i >= 0; i--) {
//             arr[i + k] = arr[i];
//         }
//         for (int i = 0; i < k; i++) {
//             arr[i] = temp[i];
//         }
//     }
//     public void rotateLeft(int[] arr, int k) {
//         int n = arr.length;
//         if (n == 0) return;
//         int[] temp = Arrays.copyOfRange(arr, 0, k);
//         for (int i = k; i < n; i++) {
//             arr[i - k] = arr[i];
//         }
//         for (int i = 0; i < k; i++) {
//             arr[n - k + i] = temp[i];
//         }
//     }

//     public static void leftrotarrk (String[] args) {
//         Solution sol = new Solution();

//         int[] arr = {1, 2, 3, 4, 5, 6, 7};
//         int k = 2;

//         sol.rotateRight(arr, k);
//         System.out.println("Array after right rotation: " + Arrays.toString(arr));
//     }
// } //TC: o(n) and SC: o(n)

//optimal approach
// class Solution {
//     void reverseArray(int[] nums, int start, int end) {
//         while (start < end) {
//             int temp = nums[start];
//             nums[start] = nums[end];
//             nums[end] = temp;
//             start++;
//             end--;
//         }
//     }

//     public int[] rotateArray(int[] nums, int k, String direction) {
//         int n = nums.length;
//         if (n == 0 || k == 0) return nums;
//         k = k % n;
//         if (direction.equals("right")) {
//             reverseArray(nums, 0, n - 1);
//             reverseArray(nums, 0, k - 1);
//             reverseArray(nums, k, n - 1);
//         } 
//         else if (direction.equals("left")) {
//             reverseArray(nums, 0, k - 1);
//             reverseArray(nums, k, n - 1);
//             reverseArray(nums, 0, n - 1);
//         }
//         return nums;
//     }
// }

// public class leftrotarrk {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] nums = {1, 2, 3, 4, 5, 6, 7};
//         int k = 2;
//         String direction = "right";
//         int[] result = sol.rotateArray(nums, k, direction);
//         for (int num : result) {
//             System.out.print(num + " ");
//         }
//     }
// }//TC: o(n) and SC: o(1)
