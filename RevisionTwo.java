public class RevisionTwo { 
    /*public static int linearSearch(int numbers[], int key){
        for(int i=0;i<=numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }*/
    /*public static int largestSmallest(int numbers[]){
        int largest=Integer.MIN_VALUE; 
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        System.out.println("The smallest is " + smallest);
        return largest;
    }*/
    /*public static int binarySearch(int numbers[],int key){
        int start=0, end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }*/
    public static void main (String args[]){
        int numbers[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println("Index of key is  " + binarySearch(numbers,key));

        /*int numbers[]={2,4,6,8,10,12};
        int key=10;
        System.out.println(linearSearch(numbers,key));*/
        /*if(index==-1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key is found at index " + index);
        }*/
    } 

    
}
