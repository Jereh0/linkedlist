/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singlylinkedlist;

/**
 *
 * @author PC #25
 */
public class SinglyLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SingleLinkedListClass link = new SingleLinkedListClass();
        SingleLinkedListClass.Node node = link.new Node(5);
        
        link.addNode(1);
        link.addNode(2);
        link.addNode(3);
        link.addNode(4);
        link.addNode(5);
        link.display();
        link.deleteFirstNode();
        System.out.println("\nDeleted first node");
        link.display();
        System.out.println("\nDeleted last node");
        link.deleteAnywhere(3);
        link.display();
        System.out.println("\nDeleted last node");
        link.deleteLastNode();
        link.display();
        System.out.println("\n");
        link.addNode(1);
        link.addNode(3);
        link.addNode(5);
        
        link.display();
    }
    
}
