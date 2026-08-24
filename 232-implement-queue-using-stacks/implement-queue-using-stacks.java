class MyQueue {
  private Stack<Integer> Stack1;
  private Stack<Integer> Stack2;
    public MyQueue() {
      this.Stack1=new Stack<>();
      this.Stack2=new Stack<>();
        
    }
    
    public void push(int x) {
        while(!Stack1.isEmpty())
        {
            Stack2.push(Stack1.pop());
        }
        Stack1.push(x);
        while(!Stack2.isEmpty())
        {
          Stack1.push(Stack2.pop());
        }
    }
    
    public int pop() {
        return Stack1.pop();
    }
    
    public int peek() {
        return Stack1.peek();
    }
    
    public boolean empty() {
        return Stack1.isEmpty();
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