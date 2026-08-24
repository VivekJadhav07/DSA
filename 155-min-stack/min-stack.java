class MinStack {

private Stack<Integer> s1;
private Stack<Integer> m1;
    public MinStack() {
        s1=new Stack<>();
        m1=new Stack<>();
        
    }
    
    public void push(int value) {
        s1.push(value);
        if(!m1.isEmpty())
        {
            if(m1.peek()>=value)
            {
                m1.push(value);
            }

        }else{
            m1.push(value);
        }
        
    }
    
    public void pop() {
        if(!s1.isEmpty() && !m1.isEmpty())
        {
        if(s1.peek().equals(m1.peek()))
        {
            m1.pop();
        }
        s1.pop();
        }
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        if(m1.isEmpty())
        {
            return 0;
        }
       return  m1.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */