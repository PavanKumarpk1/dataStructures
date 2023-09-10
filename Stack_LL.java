public class Stack_LL {
    private static class Node { // Make Node a private inner class
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private static class Stack {
        private Node head; // Make head a private instance variable

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

    }
    
    public static void main(String[] args) {
        Stack stack = new Stack();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while(!stack.isEmpty()){
        System.out.println(stack.pop());
        }
    }
}
