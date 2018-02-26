/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoohandlung;

import MyLinkedList.*;

/**
 *
 * @author menze
 */
public class Tierliste <T extends Laufen> {
    MyLinkedList<T> mll=null;
    
    public Tierliste(MyLinkedList<T> mll){
        this.mll=mll;
    }
    
    public int zaehleBeine(){
        int summe=0;
      for (T tier:mll){
          summe+=tier.getAnzahlBeine();
      }
        return summe;
    }
    
    
    
}
