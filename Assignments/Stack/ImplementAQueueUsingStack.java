static class Myqueue{
        Stack<Integer> s1= new Stack<>();
        Stack<Integer> s2= new Stack<>();
        public void push(int x) {
           s1.push(x);
        }
        public int pop() {
                if(s2.isEmpty()){
                        while(!s1.isEmpty()){
                                s2.push(s1.pop());
                        }
                }
                return s2.pop();
        }
        
        public int peek() {
                if(s2.isEmpty()){
                        while(!s1.isEmpty()){
                                s2.push(s1.pop());
                        }
                }
                return s2.peek();
        }
        
        public boolean empty() {
             if(s1.isEmpty() && s2.isEmpty()){
                return true;
                }else{
                        return false;
                }
        }
}
