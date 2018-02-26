package MyLinkedList;

import java.util.Collection;
import java.util.Iterator;

public class MyLinkedList<T> implements Iterator<T>, Iterable<T> {

    Knoten<T> ersterKnoten = null;
    Knoten<T> letzterKnoten = null;
    Knoten<T> aktuellerKnoten = null;

    @Override
    public boolean hasNext() {
        boolean rg = aktuellerKnoten != null;
        if (aktuellerKnoten == null) {
            aktuellerKnoten = ersterKnoten;
        }
        return rg;
    }

    @Override
    public T next() {
        T rg = aktuellerKnoten.inhalt;
        aktuellerKnoten = aktuellerKnoten.nachfolger;
        return rg;
    }

    public void add(T t) {
        Knoten<T> neuerKnoten = new Knoten();
        neuerKnoten.inhalt = t;
        if (letzterKnoten != null) {
            neuerKnoten.vorgänger = letzterKnoten;
            letzterKnoten.nachfolger = neuerKnoten;
        } else {
            ersterKnoten = neuerKnoten;
            aktuellerKnoten = neuerKnoten;
        }
        letzterKnoten = neuerKnoten;
    }

    public T getFirst() {
        return ersterKnoten.inhalt;
    }

    public T getLast() {
        return letzterKnoten.inhalt;
    }

    public MyLinkedList() {
    }

    @Override
    public Iterator<T> iterator() {
        return this;
    }

}
