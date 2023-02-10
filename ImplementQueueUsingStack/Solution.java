class MyQueue {

    public Stack<Integer> p;
    public Stack<Integer> s;

    public MyQueue() {
        p = new Stack();
        s = new Stack();
    }
    
    public void push(int x) {
        p.push(x);
    }
    
    public int pop() {
        if(s.isEmpty()) while(!p.isEmpty()) s.push(p.pop());
        return s.pop();
    }
    
    public int peek() {
        if(s.isEmpty()) while(!p.isEmpty()) s.push(p.pop());
        return s.peek();
    }
    
    public boolean empty() {
        return s.isEmpty() && p.isEmpty();
    }
}
