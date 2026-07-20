import java.util.Stack;

class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
public class MinStack {
    Stack<Pair> stack = new Stack<>();


    public void push(int value) {
        if(stack.isEmpty()){
            stack.push(new Pair(value,value));
        }
        else{
            stack.push(new Pair(value,stack.peek().second));
        }
    }

    public void pop() {
        if(stack.isEmpty()) return;



    }

    public int top() {
        if(stack.isEmpty()) return 0;
        return stack.peek().first;

    }

    public int getMin() {
        return stack.peek().second;
    }
    public MinStack() {

    }

}
