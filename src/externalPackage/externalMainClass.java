package externalPackage;

import MyLinkedList.MyLinkedList;

public class externalMainClass {

    public static void main(String[] args) {
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
        System.out.println(mll.getFirstElement());
        System.out.println(mll.getLastElement());
    }
}
