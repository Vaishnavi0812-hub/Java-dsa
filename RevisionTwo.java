import java.util.*;
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
    /*public static void printSubArr(int arr[]){
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
                                    
    }*/
    /*public static void maxSubarraySum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        //create a prefix array
        int prefix[]=new int[arr.length];
        //caculate prefix array
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=arr[i] + prefix[i-1];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum is " + maxSum);
    }*/
    /*public static void maxSubarraySum(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Max subarray sum is " + ms);
    }*/
    /*public static boolean containsDuplicate(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }*/
    /*public static int rotatedArray(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }*/
    /*public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }*/
    /*public static void selectSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }*/
    /*public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }*/
    /*public static void countSort(int arr[]){
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
            int count[]=new int[largest+1];
            for(int i=0;i<arr.length;i++){
                count[arr[i]]++;
            }
            int j=0;
            for(int i=0;i<count.length;i++){
                while(count[i]>0){
                    arr[j]=i;
                    j++;
                    count[i]--;
                }
            }
        
    }*/
    public static boolean searchMatrix(int matrix[][],int key){
         for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                     if(matrix[i][j]==key){
                        System.out.println("Key is at index " + i + " , " +  j);
                        return true;
                     }
                }
            }
            System.out.println("Key not found");
            return false;

    }
     public static void main (String args[]){
        int matrix[][]=new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;

        Scanner sc=new Scanner(System.in);
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                     matrix[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                     System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            searchMatrix(matrix, 5);
        

        /*int arr[]={1,4,1,3,2,4,3,7};
         countSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }*/

       /*bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }*/

       

        /*int arr[]={4,5,6,7,0,1,2};
        int target=4;
        System.out.println(rotatedArray(arr,target));*/    
        /*int arr[]={2,4,6,8,10};
        printSubArr(arr);*/

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
