/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author user
 */
public class Uts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        linkedlist link = new linkedlist();
        link.addfirst("gayung");
        link.addfirst("sabun");
        link.addlast("kardus");
        link.addlast("sikat");
        link.tampilkan();
        link.deletelast();
        link.tampilkan();
        link.deletefirst();
    }
    
}
