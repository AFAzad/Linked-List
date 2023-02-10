public class Link_List{
    Node head;
    private int size;

    Link_List(){
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
    
    public static void main(String[] args){
        Link_List list = new Link_List();
        list.addFirst("friends");
        list.addFirst("dude");
        list.addFirst("Hello !");

        list.addLast("Whats up");
        list.addFirst("hello");
        list.printList();
        list.addLast("hey");

        // After delete first "hello"
        System.out.println();
        System.out.println("After delete first hello ");
        list.deleteFirst();
        list.printList();


        list.deleteLast();
        list.printList();

        // size print
        System.out.println(list.getSize());
        
        

    }

}