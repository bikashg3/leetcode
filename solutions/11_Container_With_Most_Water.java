class Solution {
    public int maxArea(int[] height) {
       // if (height.length < 1){
       //     return 0;
       // }
        int maxA = 0;
        int area = 0;
        int l = 0, r = height.length - 1;
        while (l<r){
            area = (r-l) * Math.min(height[l],height[r]);
            maxA = Math.max(area,maxA);
            if (height[r]<=height[l]){
                r--;
            }
            else{
                l++;
            }
        }
        return maxA;
        
        
    }
}
