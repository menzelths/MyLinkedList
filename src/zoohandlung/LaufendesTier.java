/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoohandlung;

/**
 *
 * @author menze
 */
public class LaufendesTier {
    
    private String name="";
    
    LaufendesTier(String name){
        this.name=name;
    }
    void laufe(){
        System.out.println("Ich laufe "+name);
    }
}
