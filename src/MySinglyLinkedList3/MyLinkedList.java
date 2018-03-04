package MySinglyLinkedList3;

public class MyLinkedList<T> {

    Knoten<T> ersterKnoten = null;
    Knoten<T> letzterKnoten = null;

    public void add(T t) {
        Knoten<T> k = new Knoten();
        k.inhalt = t;
        if (ersterKnoten == null) {
            ersterKnoten = k;
            letzterKnoten = k;
        }
        letzterKnoten.nachfolger = k;
        letzterKnoten = k;
    }

    public void printAll() {
        Knoten<T> aktuellerKnoten = ersterKnoten;
        while (aktuellerKnoten != null) {
            System.out.println(aktuellerKnoten.inhalt);
            aktuellerKnoten = aktuellerKnoten.nachfolger;
        }
    }
}
