class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1=new Stack<Integer>();
        s2=new Stack<Integer>();
    }
    
    public void push(int x) {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    
    public int pop() {
        if(s1.isEmpty())
            return 0;
        else{
            int x=s1.pop();
            return x;
        }
        
    }
    
    public int peek() {
          if(s1.isEmpty())
            return 0;
          else{
              int x=s1.peek();
              return x;
          }
        
        
    }
    
    public boolean empty() {
        if(s1.isEmpty())
            return true;
        else
            return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */