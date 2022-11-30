class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
        boolean ans=true;
        HashSet seen=new HashSet();
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                   visited[j] = true;
                   count++;
                }    
            }
            if(!seen.add(count))
               ans=false;;
        }
        return ans;
        
    }
        
}