//brute-force
// // class Solution {
//     public void sortZeroOneTwo(int[] nums) {
//         int count0 = 0, count1 = 0, count2 = 0;

//         for(int num : nums) {
//             if(num == 0) count0++;
//             else if(num == 1) count1++;
//             else count2++;
//         }

//         int index = 0;

//         while(count0-- > 0) {
//             nums[index++] = 0;
//         }

//         while(count1-- > 0) {
//             nums[index++] = 1;
//         }

//         while(count2-- > 0) {
//             nums[index++] = 2;
//         }
//     }
// }

// class sortanarr {
//     public static void main(String[] args) {
//         int[] nums = {1, 0, 2, 1, 0};

//         Solution obj = new Solution();
//         obj.sortZeroOneTwo(nums);

//         for(int num : nums) {
//             System.out.print(num + " ");
//         }
//     }
// }
// //tc: O(n) and sc: O(1)


//better approach
// class Solution {
//     public void sortZeroOneTwo(int[] nums) {
//         int cnt0 = 0, cnt1 = 0, cnt2 = 0;

//         for (int num : nums) {
//             if (num == 0) cnt0++;
//             else if (num == 1) cnt1++;
//             else cnt2++;
//         }

//         for (int i = 0; i < cnt0; i++) {
//             nums[i] = 0;
//         }

//         for (int i = cnt0; i < cnt0 + cnt1; i++) {
//             nums[i] = 1;
//         }

//         for (int i = cnt0 + cnt1; i < cnt0 + cnt1 + cnt2; i++) {
//             nums[i] = 2;
//         }
//     }
// }

// class sortanarr {
//     public static void main(String[] args) {
//         int[] nums = {0, 2, 1, 2, 0, 1};

//         Solution sol = new Solution();
//         sol.sortZeroOneTwo(nums);

//         System.out.println("After sorting:");
//         for (int num : nums) {
//             System.out.print(num + " ");
//         }
//     }
// }
// //tc: O(n) and sc: O(1)


//optimal approach
// class Solution {
//     public void sortZeroOneTwo(int[] nums) {
//         int low = 0, mid = 0, high = nums.length - 1;

//         while (mid <= high) {
//             if (nums[mid] == 0) {
//                 int temp = nums[low];
//                 nums[low] = nums[mid];
//                 nums[mid] = temp;
//                 low++;
//                 mid++;
//             }

//             else if (nums[mid] == 1) {
//                 mid++;
//             }

//             else {
//                 int temp = nums[mid];
//                 nums[mid] = nums[high];
//                 nums[high] = temp;
//                 high--;
//             }
//         }
//     }
// }

// // Driver code
// class sortanarr {
//     public static void main(String[] args) {
//         Solution obj = new Solution();
//         int[] nums = {2, 0, 2, 1, 1, 0};

//         obj.sortZeroOneTwo(nums);

//         for (int num : nums) {
//             System.out.print(num + " ");
//         }
//     }
// }
// //TC: O(n) and SC: O(1)