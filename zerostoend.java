// // brute force approach
// class Solution {
//     public int[] moveZeroes(int[] arr) {
//         int[] temp = new int[arr.length];
//         int index = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != 0) {
//                 temp[index] = arr[i];
//                 index++;
//             }
//         }
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = temp[i];
//         }
//         return arr;
//     }
// }

// public class zerostoend {
//     public static void main(String[] args) {
//         int[] arr = {0, 1, 0, 3, 12};
//         Solution sol = new Solution();
//         int[] result = sol.moveZeroes(arr);
//         System.out.print("Array after moving zeroes: ");
//         for (int num : result) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }
// } //TC: o(n) and SC: o(n)

//optimal approach
// class Solution {
//     public void moveZeroes(int[] nums) {
//         int j = -1;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == 0) {
//                 j = i;
//                 break;
//             }
//         }
//         if (j == -1) return;
//         for (int i = j + 1; i < nums.length; i++) {
//             if (nums[i] != 0) {
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//                 j++;
//             }
//         }
//     }
// }

// public class zerostoend {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] nums = {0, 1, 0, 3, 12};
//         sol.moveZeroes(nums);
//         for (int num : nums)
//             System.out.print(num + " ");
//         System.out.println();
//     }
// }//TC: o(n) and SC: o(1)

