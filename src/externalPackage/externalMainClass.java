package externalPackage;

import MyLinkedList.MyLinkedList;
import MyLinkedList.Knoten;
import java.util.LinkedList;
import zoohandlung.*;

public class externalMainClass {

    public static void main(String[] args) {
        
        //LinkedList<Double> mll=new LinkedList();
        
        MyLinkedList<Double> mll = new MyLinkedList();
        for (int i = 0; i < 10; i++) {
            mll.add(Math.random());
        }

        
        // mll.add("Test");
        for (Double d : mll) {
            System.out.println("" + d);
        }

        for (Double d : mll) {
            System.out.println("" + d);
        }

        System.out.println("");
        System.out.println(mll.getFirst());
        System.out.println(mll.getLast());
        
        
        
        LinkedList<Tier> ll=new LinkedList();
        MyLinkedList<Laufen> mll2=new MyLinkedList();
        for (int i=0;i<10;i++){
            Loewe l=new Loewe("Leo"+Math.random(),Math.random());
            l.setAnzahlBeine((int)(Math.random()*10));
            ll.add(l);
            ll.add(new Fisch("Nemo"+Math.random(),Math.random()));
        }
        
        ll.stream().filter(el->el instanceof Laufen).map(el->(Laufen)el).forEach(mll2::add);
        
        int anzahlBeine=ll.stream().filter(el->el instanceof Laufen).map(el->((Laufen)el).getAnzahlBeine()).reduce(0,(a,b)->a+b);
        
        Tierliste<Laufen> t=new Tierliste(mll2);
        System.out.println("Anzahl Beine 1: "+t.zaehleBeine());
        System.out.println("Anzahl Beine 2: "+anzahlBeine);
        
        
    }
}
