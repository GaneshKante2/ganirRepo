import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);
        //get
        System.out.println(list.get(2));

        list.add(0,2);
        System.out.println(list);

        list.set(1,4);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        System.out.println(list);


    }
    
}
