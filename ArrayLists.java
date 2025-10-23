import java.util.*;
public class ArrayLists {
    /*public static void swap(ArrayList<Integer>list, int idx1, int idx2){
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }*/
    public static int storeWater(ArrayList<Integer>height){
        int maxWater=Integer.MIN_VALUE;
        for(int i=0;i<height.size();i++){
            for(int j=1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int currWater=ht*width;
                maxWater=Math.max(maxWater, currWater);

            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height= new ArrayList<>();
        //ArrayList<String> name= new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
       

        /*Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);*/

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
