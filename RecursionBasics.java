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
    public static int sumofNumbers(int n){
        if(n==1){
            return 1;
        }
        int snm1=sumofNumbers(n-1);
        int totSum=n+snm1;
        return totSum;
    }

    public static void main(String args[]){
        int n=5;
        System.out.println(sumofNumbers(n));

        //System.out.println(fact(5));
        //printDecreasing(8);
        //printIncreasing(8);

    }
    
}
