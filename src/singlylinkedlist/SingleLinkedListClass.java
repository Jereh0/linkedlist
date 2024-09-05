/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singlylinkedlist;

/**
 *
 * @author PC #25
 */
public class SingleLinkedListClass {
    class Node{
        private int data;
        private Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
   }
    private Node head = null;
    private Node tail = null;
    
    public void addNode (int addValue){
        Node value = new Node (addValue);
        if (head == null){
            head = value;
            tail = value;    
        }else{
        tail.next = value;
        tail = value;
            
        }
    }
    
    public void deleteFirstNode(){
        if(head == null){
            System.out.println("Linked List is Empty!");
        }else{
            head = head.next;
            if(head == null){
                tail = null;
            }
        }
    }
    
   public void deleteLastNode(){
       if(head == null){
           System.out.println("Linked List is Empty!");
       }else {
                Node current = head;
                while(current.next!= tail){
                    current = current.next;
                }
                current.next = null;
                tail = current;
            }
        }   
   public void deleteAnywhere(int value){
       if (head == null){
           System.out.println("Linked List is Empty!");
       }else if(head.data == value){
           deleteFirstNode();
       }else{
           Node current = head;
           Node previous = null;
           
        while(current != null && current.data !=value){
            previous = current;
            current = current.next;
           }
           if(current == null){
               System.out.println("Not here");
           }else{
               previous.next = current.next;
               if(current==tail){
                   tail = previous;
               }
           }
       }
    }
   public void display(){
       Node current = head;
       
       if (head == null){
           System.out.println("Linked list is Empty!");
       }else{
           while(current != null){
               System.out.println(current.data);
               current= current.next;
           }
       }
   
   }
}
