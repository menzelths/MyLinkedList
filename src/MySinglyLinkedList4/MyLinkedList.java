package MySinglyLinkedList4;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterator<T>, Iterable<T> {

    Knoten<T> ersterKnoten = null;
    Knoten<T> letzterKnoten = null;
    Knoten<T> aktuellerKnoten = null;

    public void add(T t) {
        Knoten<T> k = new Knoten<>();
        k.inhalt = t;
        k.inhalt = t;
        if (ersterKnoten == null) { //erstes Element
            ersterKnoten = k;
            letzterKnoten = k;
        } else {
            letzterKnoten.nachfolger = k;
            letzterKnoten = k;
        }
    }

    @Override
    public boolean hasNext() {
        boolean rueckgabe = aktuellerKnoten != null;
        if (rueckgabe == false) {
            aktuellerKnoten = ersterKnoten;
        }
        return rueckgabe;
    }

    @Override
    public T next() {
        T rueckgabe = aktuellerKnoten.inhalt;
        aktuellerKnoten = aktuellerKnoten.nachfolger;
        return rueckgabe;
    }

    @Override
    public Iterator<T> iterator() {
        return this;
    }
}
