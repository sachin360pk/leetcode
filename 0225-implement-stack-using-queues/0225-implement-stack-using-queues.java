class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        if(q1.isEmpty())
            return 0;
        while(q1.size()!=1){
            q2.add(q1.peek());
            q1.remove();
            
        }
        int x=q1.remove();
        Queue<Integer> q=q1;
        q1=q2;
        q2=q;
        return x;
        
    }
    
    public int top() {
       if(q1.isEmpty())
            return 0;
        while(q1.size()!=1){
            q2.add(q1.peek());
            q1.remove();
            
        }
        int topp=q1.remove();
        q2.add(topp);
        Queue<Integer> q=q1;
        q1=q2;
        q2=q;
        return topp;
        
    }
    
    public boolean empty() {
        if(q1.size()==0)
            return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */