import java.util.LinkedList;
public class LinkList2 {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("is");
        list.addFirst("name");
        list.addFirst("My");

        System.out.println(list);
        list.addLast("Abul");
        list.add("Azad");

        System.out.println(list);

        System.out.println(list.size());

        for(int i =0; i < list.size(); i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");

        list.removeLast();
        System.out.println(list);


    }
}
