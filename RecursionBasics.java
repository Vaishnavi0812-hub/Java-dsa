import java.util.HashSet;
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
    /*public static int optPower(int x, int n){
        if(n==0){
            return 1;
        }
        int xtn=optPower(x, n/2);
        int xn=xtn*xtn;     
        if(n%2!=0){
            xn=x*xn;
        }
        return xn;
    }*/
    /*public static int tiling(int n){
        if(n==0||n==1){
            return 1;
        }
        int fnm1=tiling(n-1);
        int fnm2=tiling(n-2);
        int totWays=fnm1+fnm2;
        return totWays;

    }*/
    /*public static String removeDuplicates(String str){

        HashSet<Character> seen=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(!seen.contains(c)){
                seen.add(c);
                sb.append(c);
            } 
        }
        return sb.toString();
    }*/
    /*public static void removeDuplicates(String str, int idx, StringBuilder sb, boolean map[]){
        if(idx==str.length()){
            System.out.println(sb);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicates(str, idx+1, sb, map);
        }
        else{
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, sb.append(currChar), map);
        }

    }*/
    /*public static int friendsPair(int n){
        if(n==1||n==2){
            return n;
        }
        //single
        int single=friendsPair(n-1);
        int pair=friendsPair(n-2);
        int pairWays=(n-1)*pair;
        int totWays=single+pairWays;

        return totWays;
    }*/
    /*public static void binaryStrings(int n, int lastPlace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        if(lastPlace==0){
            binaryStrings(n-1, 0, str+"0");
            binaryStrings(n-1, 1, str+"1");
        } else{
            binaryStrings(n-1, 0, str+"0");

        }
    }*/
    /*public static void keyOccurence(int arr[], int key, int idx){
        if(idx==arr.length){
            return;
        } 
        if(arr[idx]==key){
            System.out.print(idx + " ");
        }
        keyOccurence(arr, key, idx+1);


    }*/
    /*static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void printDigits(int num){
        if(num==0){
            return;
        }
        int lastDigit=num%10;
        printDigits(num/10);
        System.out.print(digits[lastDigit] + " ");
    }*/
    /*public static int lengthOfString(String str){
        if(str.length()==0){
            return 0;
        }
        return lengthOfString(str.substring(1)) +1;
    }*/
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Trasnfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void main(String args[]){
        int n=3;
        towerOfHanoi(n,"A","B","C");
        //String str="aba";
        //System.out.println(lengthOfString(str));
        //printDigits(1234);
        //binaryStrings(3, 0, "");
        //System.out.println(friendsPair(3));
        //String str="appnnacollege";
        //removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        //System.out.println(tiling(3));
        //System.out.println(optPower(2, 5));
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
