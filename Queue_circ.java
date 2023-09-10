public class Queue_circ {
    

        static class Queue {
            private int arr[];
            private int size;
            private int rear = -1;
            private int front = -1;

            Queue(int size) {
                this.size = size;
                arr = new int[size];
            }
            
            public boolean isFull(){
                return (rear+1)%size ==front;

            }
                

            public boolean isEmpty() {
                return rear == -1 && front ==-1;
                
            }
    
            public void addData(int data) {
                if(isFull()){
                    System.out.println("Queue is full");
                    return;
                }
                
                if(front == -1){
                    front =0;
                    
                }

                rear = (rear+1)%size;
                arr[rear] = data;
            }
    
            public int remove() {
                if (isEmpty()) {
                    System.out.println("Empty Queue");
                    return -1;
                }
    
                int result = arr[front];

                if(rear == front){
                    rear = front = -1;
                }
                else{
                    front = (front+1)%size;
                }
                
                return result;
            }
        }
    
        public static void main(String[] args) {
            Queue q = new Queue(5); // Create an instance of the outer class
             
    
            q.addData(3);
            q.addData(6);
            q.addData(8);
            q.addData(11);
            q.addData(7); 
            while(!q.isEmpty()){
            System.out.println(q.remove()); 
            }
    
        }
    }
    
    

