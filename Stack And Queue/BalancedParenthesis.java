import java.util.Deque;
import java.util.LinkedList;


public class BalancedParenthesis {
    public boolean Check(String s){
        Deque<Character> stack = new LinkedList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            else {
                if (stack.isEmpty()) return false;
                char ch = stack.peek();
                if((s.charAt(i) == ')' && ch == '(') || (s.charAt(i) == ']' && ch == '[') || (s.charAt(i) == '}' && ch == '{')){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
