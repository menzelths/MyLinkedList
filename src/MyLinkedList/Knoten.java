package MyLinkedList;

public class Knoten<T> {

    Knoten<T> vorgänger = null, nachfolger = null;
    T inhalt = null;

    public T getInhalt() {
        return inhalt;
    }

    public String toString() {
        return "" + inhalt;
    }
}
