package externalPackage;

import MySinglyLinkedList1.MyLinkedList;
import zoohandlung.*;

public class Main1 {

    public static void main(String[] args) {
        MyLinkedList mll = new MyLinkedList();
        for (int i = 0; i < 10; i++) {
            Loewe l = new Loewe("Leo" + i, Math.random());
            mll.add(l);
        }
        mll.printAll();
    }
}
