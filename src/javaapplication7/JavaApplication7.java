/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author menze
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyLinkedList mll=new MyLinkedList();
        for (int i=0;i<10;i++){
            mll.add(Math.random());
        }
        
        for (Object d:mll){
            System.out.println(""+d); 
        }
        
         for (Object d:mll){
            System.out.println(""+d); 
        }
         
         System.out.println("");
         System.out.println(""+mll.getFirstElement().inhalt);
         System.out.println(""+mll.getLastElement().inhalt);
    }
    
}
