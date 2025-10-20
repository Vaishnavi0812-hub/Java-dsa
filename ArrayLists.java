import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<String> name= new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //int element=list.get(2);
        //System.out.println(element);

        //list.remove(2);
       // System.out.println(list);
       //list.set(1,10);
       //System.err.println(list);

       System.out.println(list.contains(1));
       System.out.println(list.contains(10));
        
    }

    
}
