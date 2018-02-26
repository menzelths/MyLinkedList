/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author menze
 */
public class MyLinkedList<T> implements Iterator, Iterable {

    private Knoten<T> ersterKnoten = null;
    private Knoten<T> letzterKnoten = null;
    private Knoten<T> aktuellerKnoten = null;

    @Override
    public boolean hasNext() {
        boolean rg=aktuellerKnoten!=null;
        if (aktuellerKnoten==null){
            aktuellerKnoten=ersterKnoten;
        }
        return rg;
    }

    @Override
    public Object next() {
        Object rg=aktuellerKnoten.inhalt;
        aktuellerKnoten= aktuellerKnoten.nachfolger;
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
    
    public Knoten getFirstElement(){
        return ersterKnoten;
    }
    
    public Knoten getLastElement(){
        return letzterKnoten;
    }

    public MyLinkedList() {

    }

    @Override
    public Iterator iterator() {
        return this;
    }

}
