class MyQueue {
    Stack<Integer> s;
    Stack<Integer> t;


    public MyQueue() {
        s=new Stack<>();
        t=new Stack<>();
        
    }
    
    public void push(int x) {
        if(s.size()<10000){
            s.push(x);
        }

        
    }
    
    public int pop() {
       if(!s.isEmpty()){
        while(!s.isEmpty()){
            t.push(s.pop());
        }
        int removed=t.pop();
        while(!t.isEmpty()){
            s.push(t.pop());
        }
        return removed;
       }

       return -1;

        
    }
    
    public int peek() {
         if(!s.isEmpty()){
        while(!s.isEmpty()){
            t.push(s.pop());
        }
        int front=t.peek();
        while(!t.isEmpty()){
            s.push(t.pop());
        }
        return front;
         }
         return -1;
        
    }
    
    public boolean empty() {
        return s.isEmpty();
        
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