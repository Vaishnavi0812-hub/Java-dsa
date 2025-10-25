
import java.util.ArrayList;

public class ArrayLists {
    /*public static void swap(ArrayList<Integer>list, int idx1, int idx2){
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }*/
    /*public static int storeWater(ArrayList<Integer>height){
        int maxWater=Integer.MIN_VALUE;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int ht=Math.min(height.get(lp), height.get(rp));
            int width=rp-lp;
            int currWater= ht*width;
            maxWater=Math.max(maxWater, currWater);
            
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
          
    }*/
    /*public static boolean pairSum(ArrayList<Integer>list, int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i) + list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }*/
    /*public static boolean pairSum(ArrayList<Integer>list, int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target){
                lp++;
            }
            else if (list.get(lp) + list.get(rp) > target){
                rp--;
            }

        }
        return false;
    }*/
    /*public static boolean pairSum2(ArrayList<Integer> list, int target){
        int bp=-1;
        int n=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            //case1
            if(list.get(lp) + list.get(rp)==target){
                return true;
            }
              if(list.get(lp) + list.get(rp)<target){
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }*/
/*public static boolean monotonic(ArrayList<Integer> list){
    for(int i=0;i<list.size();i++){
        for(int j=i+1;j<list.size();j++){
            if(list.get(i)<list.get(i+1) || list.get(i)>list.get(i+1)){
                return true;
            }
        }
    }
    return false;
}*/
/*public static int frequentNumber(ArrayList<Integer> list, int key){
    int result[]=new int[1000];
    for(int i=0;i<list.size()-1;i++){
        if(list.get(i)==key){
            result[list.get(i+1)-1]++;
        }
    }
    int max=Integer.MIN_VALUE;
    int ans=0;

    for(int i=0;i<1000;i++){
        if(result[i]>max){
            max=result[i];
            ans=i+1;
        }
    }
    return ans;
}*/
/*public static ArrayList<Integer> lonelyNumbers(ArrayList<Integer> list){
    Collections.sort(list);
    ArrayList<Integer>nums=new ArrayList<>();

    for(int i=1;i<list.size()-1;i++){
        if(list.get(i)> list.get(i-1)+1 && list.get(i+1)> list.get(i) +1){
            nums.add(list.get(i));
        }
    }

    if(list.size()>1 && list.get(0) +1 <list.get(1)){
        nums.add(list.get(0));
    }

    if(list.size()>1 && list.get(list.size()-2)+1<list.get(list.size()-1)){
        nums.add(list.get(list.size()-1));
    }
    if(list.size()==1){
        nums.add(list.get(0));
    }
    return nums;

}*/
public static ArrayList<Integer> beautifulArray(int n){
    ArrayList<Integer>ans=new ArrayList<>();
    DivideAndConquer(1,1,ans,n);
    return ans;
}

public static void DivideAndConquer(int start, int inc, ArrayList<Integer>ans, int n){
    if(start+inc>n){
        ans.add(start);
        return;
    }
    DivideAndConquer(start, 2*inc, ans, n);
    DivideAndConquer(start+inc, inc*2, ans, n);

}


    
    public static void main(String[] args) {
        System.out.println(beautifulArray(4));
        //ArrayList<Integer> list= new ArrayList<>();
        //ArrayList<String> name= new ArrayList<>();

        //list.add(10);
        //list.add(6);
        //list.add(5);
        //list.add(8);
        //System.out.println(lonelyNumbers(list));
        


        //System.out.println(frequentNumber(list, 1));
        //System.out.println(monotonic(list));
        //System.out.println(pairSum2(list, 16));
        //System.out.println(storeWater(height));
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
