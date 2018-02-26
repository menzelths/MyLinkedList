package externalPackage;

import MyLinkedList.MyLinkedList;
import java.util.LinkedList;

public class externalMainClass {

    public static void main(String[] args) {
        
        //LinkedList<Double> mll=new LinkedList();
        
        MyLinkedList<Double> mll = new MyLinkedList();
        for (int i = 0; i < 10; i++) {
            mll.add(Math.random());
        }

        // mll.add("Test");
        for (Object d : mll) {
            System.out.println("" + d);
        }

        for (Object d : mll) {
            System.out.println("" + d);
        }

        System.out.println("");
        System.out.println(mll.getFirst());
        System.out.println(mll.getLast());
    }
}
