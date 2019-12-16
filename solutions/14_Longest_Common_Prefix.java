class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        if (strs.length < 1){ 
            return ans;
        }
        
        int min_l = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i++){
            min_l = Math.min(min_l,(strs[i]).length());
        }
        
        String temp = "";
        int i = 0;
        int j = 0;
        for(i = 0; i<min_l; i++){
            temp = Character.toString(strs[0].charAt(i));
            
            for(j = 0; j<strs.length; j++) {
                if (!(Character.toString(strs[j].charAt(i)).equals(temp))){
                    return ans;
                }
            }
            
            ans += temp;
        }
        return ans;
        
    }
}
