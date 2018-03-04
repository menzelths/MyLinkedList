package externalPackage;

import MySinglyLinkedList4.MyLinkedList;
import zoohandlung.Loewe;
import zoohandlung.Tier;
import zoohandlung.Laufen;

public class Main4 {

    public static void main(String[] args) {
        MyLinkedList<Tier> mll = new MyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            Loewe l = new Loewe("Leo" + i, Math.random());
            mll.add(l);
        }

        for (Tier t : mll) {
            if (t instanceof Laufen) {
                System.out.println(((Laufen) t).getAnzahlBeine());
            }
        }
    }
}
