class Solution {
    
    private HashMap<Character, Character> mapDict;
    
    public Solution() {
        this.mapDict = new HashMap<Character, Character>();
        this.mapDict.put(')','(');
        this.mapDict.put('}','{');
        this.mapDict.put(']','[');
    }
    
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) return true;
        
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i <s.length(); i++) {
            char c = s.charAt(i);
            
            if (this.mapDict.containsKey(c)) {
                
                char topElement = stack.empty() ? '#' : stack.pop();
                // if mapping for the current bracket doesn't map the stack's top element
                if (topElement != this.mapDict.get(c)) {
                    return false;
                }
            } else {
                // it was an opening bracket, push to the stack
                stack.push(c);
            }
            }
        return stack.isEmpty();
        }

        
        
    }
