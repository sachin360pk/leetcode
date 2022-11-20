class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        if(n==0)
            return 0;
        int arr1[]=new int[n];
        Arrays.fill(arr1,1);
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1])
                arr1[i]=arr1[i-1]+1;
        }
        int arr2[]=new int[n];
        Arrays.fill(arr2,1);
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1])
                arr2[i]=arr2[i+1]+1;
        }
        int res=0;
        for(int i=0;i<n;i++){
            res+=Math.max(arr1[i],arr2[i]);
        }
        return res;
    }
}