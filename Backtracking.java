public class Backtracking {
    /*public static void changeArr(int arr[], int i, int val){
        if(i==arr.length){
            printArr(arr);
            return;
        }
        arr[i]=val;
        changeArr(arr, i+1, val+1);
        arr[i]=arr[i]-2;
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main (String args[]){
        int arr[]=new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
        
    }*/
    public static void subset(String str, String ans, int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //yes
        subset(str, ans+str.charAt(i), i+1);
        //no
        subset(str, ans, i+1);
    }

    public static void main (String args[]){
        String str="abc";
        subset(str, "", 0);
    }
    
}
