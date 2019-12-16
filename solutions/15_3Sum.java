// Naive Solution

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                for (int k = j+1; k < nums.length; k++){
                    List<Integer> temp = new ArrayList<>();;
                    if(nums[i]+nums[j]+nums[k] == 0){
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        if (!ans.contains(temp)){
                        ans.add(temp);
                        }
                    }
                }
            }
        }
        return ans;
    }
}


// two pointer solution

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        int n = nums.length, l = 0, r = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 || i + 3 > n) return res;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int target = -nums[i];
            l = i + 1;
            r = n - 1;
            while (l < r) {
                int actual = nums[l] + nums[r];
                if (actual == target) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[++l]);
                    while (l < r && nums[r] == nums[--r]);
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
