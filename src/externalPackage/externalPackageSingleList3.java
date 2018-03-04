package externalPackage;

import MySinglyLinkedList3.MyLinkedList;
import zoohandlung.Loewe;
import zoohandlung.Tier;

public class externalPackageSingleList3 {
    public static void main(String[] args) {
        MyLinkedList<Tier> mll=new MyLinkedList();
        for (int i=0;i<10;i++){
            Loewe l=new Loewe("Leo"+i,Math.random());
            mll.add(l);
        }
        mll.printAll();
    }
}
