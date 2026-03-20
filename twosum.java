//brute force approach for two sum problem
// class Solution {
//     public String twoSumExists(int[] arr, int target) {
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[i] + arr[j] == target) {
//                     return "YES";
//                 }
//             }
//         }
//         return "NO";
//     }

//     public int[] twoSumIndices(int[] arr, int target) {
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[i] + arr[j] == target) {
//                     return new int[]{i, j};
//                 }
//             }
//         }
//         return new int[]{-1, -1};
//     }
// }

// public class twosum {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] arr = {2, 6, 5, 8, 11};
//         int target = 14;
//         System.out.println(sol.twoSumExists(arr, target));
//         int[] res = sol.twoSumIndices(arr, target);
//         System.out.println("[" + res[0] + ", " + res[1] + "]");
//     }
// }//TC: o(n^2) and SC: o(1)

//better approach
// import java.util.HashMap;

// class Solution {
//     public String twoSumExists(int[] arr, int target) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < arr.length; i++) {
//             int complement = target - arr[i];
//             if (map.containsKey(complement)) {
//                 return "YES"; 
//             }
//             map.put(arr[i], i);
//         }
//         return "NO";
//     }

//     public int[] twoSumIndices(int[] arr, int target) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < arr.length; i++) {
//             int complement = target - arr[i];
//             if (map.containsKey(complement)) {
//                 return new int[] { map.get(complement), i };
//             }
//             map.put(arr[i], i);
//         }
//         return new int[] { -1, -1 };
//     }
// }

// public class twosum {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] arr = {2, 6, 5, 8, 11};
//         int target = 14;

//         System.out.println(sol.twoSumExists(arr, target));
//         int[] res = sol.twoSumIndices(arr, target);
//         System.out.println("[" + res[0] + ", " + res[1] + "]");
//     }
// }//TC: o(n) and SC: o(n)

//optimal approach
// import java.util.Arrays;

// class Solution {
//     public String twoSumExists(int[] arr, int target) {
//         int n = arr.length;

//         int[][] numsWithIndex = new int[n][2];

//         for (int i = 0; i < n; i++) {
//             numsWithIndex[i][0] = arr[i]; 
//             numsWithIndex[i][1] = i;      
//         }
//         Arrays.sort(numsWithIndex, (a, b) -> Integer.compare(a[0], b[0]));
//         int left = 0, right = n - 1;
//         while (left < right) {
//             int sum = numsWithIndex[left][0] + numsWithIndex[right][0];
//             if (sum == target) {
//                 return "YES";
//             } else if (sum < target) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }
//         return "NO";
//     }

//     public int[] twoSumIndices(int[] arr, int target) {
//         int n = arr.length;
//         int[][] numsWithIndex = new int[n][2];

//         for (int i = 0; i < n; i++) {
//             numsWithIndex[i][0] = arr[i];
//             numsWithIndex[i][1] = i;
//         }

//         Arrays.sort(numsWithIndex, (a, b) -> Integer.compare(a[0], b[0]));

//         int left = 0, right = n - 1;
//         while (left < right) {
//             int sum = numsWithIndex[left][0] + numsWithIndex[right][0];
//             if (sum == target) {
//                 return new int[] {numsWithIndex[left][1], numsWithIndex[right][1]};
//             } else if (sum < target) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }
//         return new int[] {-1, -1};
//     }
//}

// public class twosum {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] arr = {2, 6, 5, 8, 11};
//         int target = 14;

//         System.out.println(sol.twoSumExists(arr, target)); 
//         int[] res = sol.twoSumIndices(arr, target);
//         System.out.println("[" + res[0] + ", " + res[1] + "]"); 
//     }
// }

