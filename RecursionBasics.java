public class RecursionBasics {
    /*public static void printDecreasing(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n-1);
    }
    public static void printIncreasing(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        printIncreasing(n-1);
        System.out.print(n + " ");
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        
        int fnm1=fact(n-1);
        int factn=n*fnm1;
        return factn;
    }*/
    /*public static int sumofNumbers(int n){
        if(n==1){
            return 1;
        }
        int snm1=sumofNumbers(n-1);
        int totSum=n+snm1;
        return totSum;
    }*/
    /*public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        
        int fnm1=fibonacci(n-1);
        int fnm2=fibonacci(n-2);
        int fibo=fnm1+fnm2;
        return fibo;

    }*/
    /*public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }
         return isSorted(arr, i+1);

    }*/
    /*public static int firstOcc(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(key==arr[i]){
            return i;
        }
        return firstOcc(arr,key,i+1);
    }*/

    /*public static int lastOcc(int arr[],int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOcc(arr, key, i+1);
        if(isFound== -1 && arr[i]==key){
            return i;
        }
        return isFound;

    }*/
    /*public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        //int xnm1=power(x,n-1);
        //int xn=x*xnm1;
        //return xn;
        return x*power(x,n-1);

    }*/
    public static int optPower(int x, int n){
        if(n==0){
            return 1;
        }
        int xtn=optPower(x, n/2);
        int xn=xtn*xtn;
        if(n%2!=0){
            xn=x*xn;
        }
        return xn;
    }
    public static void main(String args[]){
        System.out.println(optPower(2, 5));
        /*int arr[]={8,3,6,9,5,10,2,5,3};
        int key=5;
        System.out.println(lastOcc(arr, 5, 0));*/
        //System.out.println(isSorted(arr, 0));
        //int n=5;
        //System.out.println(fibonacci(n));

        //int n=5;
        //System.out.println(sumofNumbers(n));
        //System.out.println(fact(5));
        //printDecreasing(8);
        //printIncreasing(8);

    }
    
}
