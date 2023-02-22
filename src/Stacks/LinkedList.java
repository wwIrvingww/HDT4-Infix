public class LinkedList <T> {
    private Node<T> head;
    private int size;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T data = head.value;
        head = head.next;
        size--;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return head.value;
    }

    public int size(){
        return size;
    }
}
