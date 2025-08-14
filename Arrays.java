import java.util.*;
public class Arrays{
    public static void maxSubarraySum(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];

        prefix[0]=numbers[0];
        for(int i=1; i<prefix.length;i++){
            prefix[i]=prefix[i-1] + numbers[i];
            
        }
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=1;j<numbers.length;j++){
                int end=j;

                currSum=start==0 ? prefix[end] : prefix[end]-prefix[start-1];

                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("The max sum is " + maxSum);
        
    }
        
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        maxSubarraySum(numbers);


    }
}
 
    /*public static void printSubArrays(int numbers[]){
        int tp=0;
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;

            for(int j=i;j<numbers.length;j++){
            int end=j;
            

                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k] + " ");
                    
                }
                tp++; 
                System.out.println();
                
            }
            System.out.println();           
        }
        System.out.println("Total subarrays are" + tp);
    }*/

        /*int numbers[]={2,4,6,8,10};
        printSubArrays(numbers);*/
    
    /*public static void printPairs(int numbers[]){
        int tp=0;
        for(int i=0; i<numbers.length;i++){
            int current=numbers[i];
            for(int j=i+1; j<numbers.length;j++){
                System.out.print("(" + current + "," + numbers[j] + ")" );
                tp++;

            }
            System.err.println();
        }
        System.out.println("Total number of pairs is" + tp);
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        printPairs(numbers);
    }*/











    /*public static void reverse(int numbers[]) {
        int first=0, last=numbers.length-1;

        while(first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            
            first++;
            last--;

        }

    }*/
    

        /*reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();*/

    
    /*public static int binarySearch(int numbers[], int key){
        int start=0 , end=numbers.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid; //found
            }
            if(numbers[mid]>key){
                end=mid-1; //left
            }
            else {
                start=mid+1; //right
            }
        }
        return -1;

    }*/

    /*public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12};
        int key=10;

        System.out.println("Index for key is " + binarySearch(numbers,key));
    }*/

    /*public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE; 
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest=numbers[i];
            }
            if(smallest > numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest value is " + smallest);
        return largest;
    }*/
    
        /*int numbers[]={1,2,6,3,5};

        System.out.println("Largest value is " + getLargest(numbers));



    }*/
    
    /*public static int linearSearch(int numbers[], int key){
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;

    }/* */

    /*public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12};
        int key=10;

        int index=linearSearch(numbers,key);
        if(index== -1){
            System.out.println("Not found in array");
        }

        else{
            System.out.println("Index of the key is " + index);
        }
    }*/



    /*public static void update(int marks[], int nonChangable ){
        nonChangable=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i] + 1;
        }
    }
    public static void main(String args[]){
        int marks[]={95,96,97};
        int nonChangable=5;
        update(marks, nonChangable);
        System.out.println(nonChangable);

        
        System.out.println(marks[i]);

        
        
    }*/


        /*int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your physics marks :");
        marks[0]=sc.nextInt();
        System.out.println("Enter your chem marks :");
        marks[1]=sc.nextInt();
        System.out.println("Enter your math marks :");
        marks[2]=sc.nextInt();

        System.out.println("Phy marks : " + marks[0]);
        System.out.println("Chem marks : " + marks[1]);
        System.out.println("Maths marks : " + marks[2]);

        int percentage=(marks[0] + marks[1] + marks[2])/3;
        System.out.println("The percentage is " + percentage + "%");

        System.out.println("Length of the array is : " + marks.length);


        marks[2]=100; marks[2] + 1;
        System.out.println("Maths marks : " + marks[2]);*/



        



