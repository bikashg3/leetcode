class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length, l = 0, r = 0, res = 0;
        if (target >=0) {res = Integer.MAX_VALUE;
                        }
        else{
            res = Integer.MIN_VALUE;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i + 3 > n) return res;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            //int target = -nums[i];
            l = i + 1;
            r = n - 1;
            while (l < r) {
                int actual = nums[l] + nums[r] + nums[i];
                if (Math.abs(target - actual) <= Math.abs(res - target)) {
                    res = nums[i] + nums[l] + nums[r];
                    if (actual < target){
                        l++;
                    }
                    else{
                        r--;
                    }

                } else if (actual < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return res;
    }
}
        
        
    
