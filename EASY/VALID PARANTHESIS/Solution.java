import java.util.*;

class Solution {
    public static  boolean isValid(String s) {

        if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') {
            return false;
        }

        Stack<Character> stack = new Stack<Character>();
        HashMap<Character,Character> _map = new HashMap<>();

        _map.put('(', ')');
        _map.put('{', '}');
        _map.put('[', ']');
        
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(_map.get(s.charAt(i)));
            }else{
                if (s.charAt(i) == stack.peek()) {
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }

        return true;
    }

    public static void main(String args[]){
        boolean flag = isValid("(]]");
        System.out.println(flag);
    }
}