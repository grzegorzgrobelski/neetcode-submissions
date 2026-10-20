class MyStack {
    List<Integer> lst = new ArrayList();

    public MyStack() {
    }

    public void push(int x) {
        lst.add(x);
    }

    public int pop() {
        int lastIndex = lst.size()-1;
        int value = lst.get(lastIndex);
        lst.remove(lastIndex);
        return value;
    }

    public int top() {
        int lastIndex = lst.size()-1;
        return lst.get(lastIndex);
    }

    public boolean empty() {
        return lst.isEmpty();
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