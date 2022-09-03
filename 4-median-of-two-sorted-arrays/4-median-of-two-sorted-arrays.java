class Solution {
    public static int[] mergeArrays(int[] nums1, int[] nums2, int n1,int n2, int[] murged)
    {
        int i = 0, j = 0, k = 0;
        while (i<n1 && j <n2)
        {
            if (nums1[i] < nums2[j])
                murged[k++] = nums1[i++];
            else
                murged[k++] = nums2[j++];
        }
     
        while (i < n1)
            murged[k++] = nums1[i++];
        while (j < n2)
            murged[k++] = nums2[j++];
        return murged;
    }
     
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sorted = new int[nums1.length+nums2.length];
        mergeArrays(nums1, nums2, nums1.length, nums2.length, sorted);
        // for even number case 
        if(sorted.length%2==0){
            
            return (sorted[(sorted.length/2)-1]+sorted[sorted.length/2])*.5;
        }else{
            return sorted[(sorted.length)/2];
        }
    }
}