package externalPackage;

import MySinglyLinkedList2.MyLinkedList;
import zoohandlung.*;

public class Main2 {
    public static void main(String[] args) {
        MyLinkedList mll=new MyLinkedList();
        for (int i=0;i<10;i++){
            Loewe l=new Loewe("Leo"+i,Math.random());
            mll.add(l);
            mll.add(Math.random());
        }
        mll.printAll();
    }
}
