import java.util.*;
public class RevLinkedList {
    Node head;
    private int size;

    RevLinkedList(){
        this.size = 0;
    }
    class Node {
        String data;
        Node next;
        Node(String data){
            this.data= data;
            this.next = null;
            size++;
        }
    }
    // Add first
    public  void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // add last 
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node crrNode = head;
        while(crrNode.next != null){
            crrNode = crrNode.next;
        }
        crrNode.next = newNode;
    }

    // print 
    public void  printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node  crrNode = head;
        
        while(crrNode != null){
            System.out.print(crrNode.data+ "->");
            crrNode = crrNode.next;
        }
        System.out.println();
        

    }
    // delete first 
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is blank");
            return;
        }
        size--;
        head = head.next;
    }
    // delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        size--;
        if(head.next== null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }
    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null ){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // updating
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    
    public static void main(String[] args){
         RevLinkedList list = new RevLinkedList();

         list.addLast(1);
         list.addLast(2);
        

        
        
        
        

    }

    
    
    
    
    
    
}
