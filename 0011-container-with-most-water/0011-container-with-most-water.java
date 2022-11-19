class Solution {
  public int maxArea(int[] height) {
    int ans = 0;
    int l = 0;//left ptr
    int r = height.length - 1;//right ptr

    while (l < r) {
      int minHeight = Math.min(height[l], height[r]);
      ans = Math.max(ans, minHeight * (r - l));
      if (height[l] < height[r])
        ++l;
      else
        --r;
    }

    return ans;
  }
}
