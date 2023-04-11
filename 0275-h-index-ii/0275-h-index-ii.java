class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        // this is brute force approach
        // for(int i=1;i<n;i++){
        //     if(n-i<=citations[i]){
        //         return n-i;
        //     }
        // }
        // return 0;
        
        // now optimize algorathim
        int ans=0;
        int start=0;
        int end=n;
        while(start<end){
            int mid=start+(end-start)/2;
            if(n-mid<=citations[mid]){
                ans=Math.max(n-mid,ans);
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}