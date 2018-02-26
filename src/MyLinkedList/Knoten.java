/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLinkedList;

/**
 *
 * @author menze
 */
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
