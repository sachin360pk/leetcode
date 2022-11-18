class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min;
    

    public MinStack() {
        stack=new Stack<Integer>();
        min=new Stack<Integer>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(val);
            min.push(val);
        }
        else{
            stack.push(val);
            int x=min.pop();
            min.push(x);
            if(x<val){
                min.push(x);
            }
            else{
                min.push(val);
            }
        }
        
    }
    
    public void pop() {
        stack.pop();
        min.pop();
        
    }
    
    public int top() {
        int x=stack.pop();
        stack.push(x);
        return x;
        
    }
    
    public int getMin() {
        int x=min.pop();
        min.push(x);
        return x;   
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */