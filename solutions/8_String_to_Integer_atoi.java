class Solution {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0){
            return 0;
        }
        
        int n = str.length();
        int i = 0;
        while(i<n && (str.charAt(i) == ' ')){
            i = i + 1;
            if (i == str.length()) return 0;
            if (str.charAt(i) != ' '){
                break;
            }
            
        }
        int sign = 1;
        if (str.charAt(i) == '+' || str.charAt(i) == '-' ){
            if (str.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }
          if (i >= str.length() || !isDigit(str.charAt(i))) {
            return 0;
        }
        long val = 0L;
        while (i<n && isDigit(str.charAt(i))){
            val = val * 10 + str.charAt(i) - '0';
            long temp = sign * val;
            if (temp < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if (temp > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
            
        }
        return (int) (val * sign);
        
        
        
    }
    
    
    private static boolean isDigit(char ch) {
        return (ch >= '0' && ch <= '9');
    }
}
