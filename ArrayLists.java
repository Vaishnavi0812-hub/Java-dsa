import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    /*public static void swap(ArrayList<Integer>list, int idx1, int idx2){
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }*/
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        //ArrayList<String> name= new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);



        //System.out.println(list);
        //swap(list, 1, 3);
        //System.out.println(list);

        /*int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        System.out.println("max element is " + max);*/

        
        

        /*for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();*/
        /*System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();*/

        //int element=list.get(2);
        //System.out.println(element);

        //list.remove(2);
       // System.out.println(list);
       //list.set(1,10);
       //System.err.println(list);

       //System.out.println(list.contains(1));
       //System.out.println(list.contains(10));
        
    }

    
}
