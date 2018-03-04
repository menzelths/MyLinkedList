package MyDoublyLinkedList1;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterator<T>, Iterable<T> {

    Knoten<T> ersterKnoten = null;
    Knoten<T> letzterKnoten = null;
    Knoten<T> aktuellerKnoten = null;

    public void add(T t) {
        Knoten<T> k = new Knoten<>();
        k.inhalt = t;
        if (ersterKnoten == null) {
            ersterKnoten = k;
            aktuellerKnoten = k;
            letzterKnoten = k;
            k.vorgänger = null; // Vorgänger vom ersten Element ist null
        } else {
            k.vorgänger = letzterKnoten; // Vorgänger ist der bisherige letzte Knoten
        }
        letzterKnoten.nachfolger = k;
        letzterKnoten = k;
    }

    public T removeLast() {
        T rueckgabe = null;
        if (letzterKnoten != null) {
            rueckgabe = letzterKnoten.inhalt;
            letzterKnoten = letzterKnoten.vorgänger;
            if (letzterKnoten != null) {
                letzterKnoten.nachfolger = null;
            } else {
                ersterKnoten = null;
                aktuellerKnoten = null;
            }
        }
        return rueckgabe;
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
