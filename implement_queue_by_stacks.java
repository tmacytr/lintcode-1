public class Solution {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Solution() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    
    public void push(int element) {
        stack1.push(element);
    }

    public int pop() {
        if(stack2.empty()){
            while(!stack1.empty()) stack2.push(stack1.pop());    
        }
        return stack2.pop();
    }

    public int top() {
        if(stack2.empty()){
            while(!stack1.empty()) stack2.push(stack1.pop());
        }
        return stack2.peek();
    }
}

