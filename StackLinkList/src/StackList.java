public class StackList implements Stack {
    private class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node top;

    StackList(){
        Node top = null;
    }

    @Override
    public void push(int value) {
        // TODO implement here
        if(!isFull()){
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;
        }

    }

    @Override
    public int pop() {
        // TODO implement here
        if(isEmpty()){
            return 0;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    @Override
    public void display() {
        // TODO implement here
        Node temp = top;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
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
