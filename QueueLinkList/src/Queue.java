public interface Queue {
    public void enqueue(int value);
    public int dequeue();
    public void display();
    public boolean isEmpty();
    public boolean isFull();
}
