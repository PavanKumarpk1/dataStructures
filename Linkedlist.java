public class Linkedlist{
    Node head;
    
    private static class Node{                 //Creating node
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){   // Adding element First in List
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){    //Adding element at last
    Node newNode = new Node(data);
    if(head == null){
            head = newNode;
            return;

        }
    Node currNode = head;                   // creating current node...To track the last 
    while(currNode.next != null){           //  node ... So we can add element at last
        currNode = currNode.next;
    }
    currNode.next = newNode;
    }

    public void deleteFirsts(){             // Delete first element
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLate(){               //Deleting last element
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;     // second last and last element is created to iterate
        Node last = head.next;      // and find the last and second lst element
        while(last.next != null){   // Finally second last's next element is set to null
            last= last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }

    public void printList(){
 
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node currNode = head;
        
        while (currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
            
        }
        System.out.print("Null");
    }

    public static void main(String[] args){
        Linkedlist LL = new Linkedlist();

        LL.addFirst("pavan");
        LL.addLast("kumar");
        LL.addFirst("p");
        LL.printList();
        System.out.println("\n\n");



    }
}