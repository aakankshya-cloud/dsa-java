import java.util.Stack;

class MinStack {
    Stack<Long> stack;
    long min;
    public MinStack() {
        stack = new Stack<>();
        min = Long.MAX_VALUE;
    }

    public void push(long value) {
        if(stack.isEmpty()){
            min = value;
            stack.push(value);
        }
        else{
            if(value > min){
                stack.push(value);
            }
            else{
                long encoded = 2*value - min;
                stack.push(encoded);
                min = value;
            }
        }
    }

    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        long x = stack.pop();
        if(x < min){
            min = 2*min - x;
        }
    }

    public long top() {
        if(stack.isEmpty()){
            return 0;
        }
        long x = stack.peek();
        if(x > min){
            return x;
        }
        return min;
    }

    public long getMin() {
        if(stack.isEmpty()){
            return -1;
        }
        return min;
    }
}