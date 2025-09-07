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
    /*public static void reverseArray(int numbers[]){
        int start=0, end=numbers.length-1;
        while(start<=end){
            int temp=numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;
            start++;
            end--;
        }
    }*/
    /*public static void subArr(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" + curr + " , " + arr[j] + " )");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total no of pairs is " + tp);
    }*/
    public static void printSubArr(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println(" Sum is " + sum);
                tp++;
                System.out.println();                
            }
            System.out.println();
        }
        System.out.println("Total no of subarrays are " + tp);
                                    
    }

    public static void main (String args[]){
        int arr[]={2,4,6,8,10};
        printSubArr(arr);

        /*int numbers[]={2,4,6,8,10,12,14};
        reverseArray(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();*/

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
