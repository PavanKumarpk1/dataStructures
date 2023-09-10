public class QueueArr {

    static class Queue {
        private int arr[];
        private int size;
        private int rear = -1;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void addData(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is Full");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5); // Create an instance of the outer class
         

        q.addData(3);
        q.addData(6);
        q.addData(8);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }


    }
}
