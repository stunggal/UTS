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
public class linkedlist {
    database first;
    public linkedlist (){
        first = null;
    }
    public boolean isempty(){
        return (first==null);
    }
    public void addfirst(String data){
        database node = new database(data);
    }
    public void addlast (String data){
        database node, help;
        node = new database(data);
        node.next = null;
        if (isempty()){
            first = node;
            first.next = null;
        }else{
            help = first;
            while(help.next!=null){
                help=help.next;
            }
            help.next=node;
        }
    }
    public void tampilkan(){
        database current = first;
        if (current == null){
            System.out.println("kosong!");
        }else{
            while(current !=null){
                current.tampil();
                current = current.next;
            }
            System.out.println();
        }
    }
    public database deletefirst(){
        if(!isempty()){
            database temp = first;
            first = first.next;
            return temp;
        }else{
            return null;
        }
    }
    public database deletelast(){
        if(!isempty()){
            database temp, current;
            current = first;
            while(current.next.next != null){
                current=current.next;
            }
            temp=current.next;
            current.next=null;
            return temp;
        }else{
            database temp = first;
            first = null;
            return temp; 
        }
    }
}
