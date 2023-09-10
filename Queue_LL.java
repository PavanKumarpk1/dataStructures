public class Queue_LL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node tail = null;
        static Node head = null;
        
        public boolean isEmpty(){
            return head == null && tail == null;
        }

        public void add(int data){
            Node newNode = new Node(data);
            if(tail == null){
                tail = head = newNode;
            }
            tail.next = newNode;
            tail = newNode;
            
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1 ;

            }
            int front = head.data;
            if(head == tail){
                tail = null;
            }
            head = head.next;
            return front;
        }
    }

    public static void main(String[]args){
        Queue q = new Queue();
        q.add(5);
        q.add(7);
        q.add(9);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }


    }
    
}
