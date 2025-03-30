public class QueueList implements Queue{

    private class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node top, tail;

    public QueueList(){
        Node top = null;
        Node tail = null;
    }

    @Override
    public void enqueue(int value) {
        // TODO implement here
        if(!isFull()){
            Node newNode = new Node(value);
            if(isEmpty()){
                top = tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
    }

    @Override
    public int dequeue() {
        // TODO implement here
        if(isEmpty()){
            return 0;
        }
        int value = top.data;
        if(top == tail){
            top = tail = null;
        } else {
            top = top.next;
        }
        return value;
    }

    @Override
    public void display() {
        // TODO implement here
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        Node temp = top;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    @Override
    public boolean isEmpty() {
        // TODO implement here
        return top == null;
    }

    @Override
    public boolean isFull() {
        // TODO implement here
        return false;
    }


}
