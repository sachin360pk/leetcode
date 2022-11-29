class Solution {
    public int trap(int[] arr) {
           int n=arr.length;
//         int res=0;
//            for (int i = 1; i < n - 1; i++) {
  
//             // Find maximum element on its left
//             int left = arr[i];
//             for (int j = 0; j < i; j++) {
//                 left = Math.max(left, arr[j]);
//             }
  
//             // Find maximum element on its right
//             int right = arr[i];
//             for (int j = i + 1; j < n; j++) {
//                 right = Math.max(right, arr[j]);
//             }
  
//             // Update maximum water value
//             res += Math.min(left, right) - arr[i];
//         }
//         return res;
         int left[] = new int[n];
        int right[] = new int[n];
        int water = 0;
        left[0] = arr[0];
        for (int i = 1; i < n; i++)
            left[i] = Math.max(left[i - 1], arr[i]);
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            right[i] = Math.max(right[i + 1], arr[i]);
  
        for (int i = 0; i < n; i++)
            water += Math.min(left[i], right[i]) - arr[i];
  
        return water;
    }
}