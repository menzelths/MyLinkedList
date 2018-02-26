/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package externalPackage;

import MyLinkedList.MyLinkedList;

/**
 *
 * @author menze
 */
public class externalMainClass {

    /**
     * @param args the command line arguments
     */
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
