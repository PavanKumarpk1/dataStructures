import java.util.ArrayList;

class Stack_AL {
    public class Stack {
        private ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if (isEmpty()) {
                return -1; // You can choose any appropriate value for an empty stack.
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
    }

    public static void main(String[] args) {
        Stack_AL stackContainer = new Stack_AL();
        Stack stack = stackContainer.new Stack(); // Create an instance of the inner Stack class
        stack.push(5);
        stack.push(4);
        stack.push(3);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
