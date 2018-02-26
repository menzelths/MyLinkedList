/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLinkedList;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author menze
 */
public class MyLinkedList<T> implements Iterator, Iterable {

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
    public Object next() {
        Object rg = aktuellerKnoten.inhalt;
        aktuellerKnoten = aktuellerKnoten.nachfolger;
        return rg;
    }

    public void add(T o) {
        Knoten<T> neuerKnoten = new Knoten<>();
        neuerKnoten.inhalt = o;
        if (letzterKnoten != null) {
            neuerKnoten.vorgänger = letzterKnoten;
            letzterKnoten.nachfolger = neuerKnoten;
        } else {
            ersterKnoten = neuerKnoten;
            aktuellerKnoten = neuerKnoten;
        }
        letzterKnoten = neuerKnoten;

    }

    public Knoten<T> getFirstElement() {
        return ersterKnoten;
    }

    public Knoten<T> getLastElement() {
        return letzterKnoten;
    }

    public MyLinkedList() {

    }

    @Override
    public Iterator iterator() {
        return this;
    }

}
