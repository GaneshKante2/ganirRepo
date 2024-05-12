import java.util.*;
public class linkedlist2 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("is");
        list.addFirst("this");
        System.out.println(list);
        list.addFirst("wow");
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
        list.remove(0);
        System.out.println(list);
        System.out.println(list.size());

        
    }
    
}
