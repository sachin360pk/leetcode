class Solution {
  public String convertToTitle(int n) {
      if(n==0)
          return "";
      String s=convertToTitle((n-1)/26)+(char)('A'+((n-1)%26));
      return s;
   
  }
}