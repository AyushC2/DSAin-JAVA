// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
       private Node front;
       private Node rear;
       private int count  =0;
    public myQueue() {
        rear = front = null;
        count = 0;
    }

    public boolean isEmpty() {
      return front == null;
    }

    public void enqueue(int x) {
        Node el = new Node(x);
        
       if(isEmpty()){
           front = rear = el;
           
       }else{
           rear.next = el;
           rear = rear.next;
          
       }
        count++;
    }

   public void dequeue() {
    if (isEmpty()) {
        return;
    }
    front = front.next;
    if (front == null) {
        rear = null;
    }
    count--;
}


    public int getFront() {
        if(isEmpty()){
            return -1;
        }else{
            return front.data;
        }
        // Returns the front element of the queue.
        // If queue is empty, return -1.
    }

    public int size() {
        return count;
    }
}
