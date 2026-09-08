package Revision.Revision;

import java.util.Stack;

public class ValidP {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        int i = 0;
        if(s.length() == 1){
            return false;
        }
        while(i < s.length() ){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()) return false;
                if(ch == ']' && stack.peek() != '[' || ch == ')' && stack.peek() != '(' || ch == '}' && stack.peek() != '{'){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
            i++;
        }
        return stack.isEmpty();
    }

}
