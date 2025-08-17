import java.util.Arrays;
public class sorting{
     public static void main(String args[]){
        int arr[]={5,3,4,2,1};
        Arrays.sort(arr);
    }

}
   

    /*public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //find out correct position to insert
            while(prev>=0 && arr[prev]>curr ){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //inserion
            arr[prev+1]=curr;
        }*/
        /*for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }*/
    
    /*public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    
    }*/
    

    /*public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }*/
    /*public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }*/
    /*public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        //printArr(arr);

    }
    
}*/
