import java.util.Stack;

public class Neetcode {
    class MinStack {
        Stack<Integer> stack;
        int min;
        public MinStack() {
            stack = new Stack<>();
            min = Integer.MAX_VALUE;
        }

        public void push(int val) {
            if(stack.isEmpty()){
                min = val;
                stack.push(val);
            }
            else{
                if(val < min){
                    int encode = 2*val - min;
                    stack.push(encode);
                    min = val;
                }
                else{
                    stack.push(val);
                }
            }
        }

        public void pop() {
            if(stack.isEmpty()) return;
            int top = stack.pop();
            if(top < min){
                min = 2*min - top;
            }
        }

        public int top() {
            if(stack.peek() < min){
                return min;
            }
            return stack.peek();
        }

        public int getMin() {
            if(stack.isEmpty()){
                return -1;
            }
            return min;
        }
    }
}