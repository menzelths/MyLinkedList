package MyDoublyLinkedList1;

public class MyStack<T> extends MyLinkedList<T> {

    public void push(T element) {
        add(element);
    }

    public T pull() {
        return removeLast();
    }

    public boolean isEmpty() {
        return ersterKnoten == null;
    }
}
