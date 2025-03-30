public class Main {
    public static void main(String[] args) {

        QueueList queue = new QueueList();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();

        while(!queue.isEmpty()){
            System.out.print(queue.dequeue() + " ");
        }
//        queue.dequeue();
        System.out.println();
        queue.display();
    }
}