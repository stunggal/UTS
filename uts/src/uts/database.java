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
public class database {
    String data;
    database next;
    public database (String data){
        this.data = data;
    }
    public void tampil(){
        System.out.println("nama barabg");
        System.out.println("{"+data+"}");
    }
}
 