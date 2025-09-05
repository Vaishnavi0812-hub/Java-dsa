import java.util.*;
public class Revision {
    /*public static int prodOfNumbers(int a, int b){
        int product=a*b;
        return product;
    }*/
    /*public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;

    }
    public static int binCoeff(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int binCoeff=fact_n/(fact_r*fact_nmr);
        return binCoeff;
    }*/
    /*public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }*/
    /*public static void decToBin(int decNum){
        int myNum=decNum;
        int binNum=0;
        int pow=0;
        while(decNum>0){
            int lastDigit=decNum%2;
            binNum=binNum+(lastDigit*(int)(Math.pow(10,pow)));
            pow++;
            decNum=decNum/2;
        }
        System.out.println("The Binary number of " + myNum + "is" + binNum);

    }*/
    /*public static double average(double a,double b,double c){
        return (a+b+c)/3;
    }*/
    /*public static int sumOfDigits(int a){
        int sum=0;
        while(a>0){
            int lastDigit=a%10;
            sum=sum+lastDigit;
            a=a/10;
        }
        return sum;
    }*/
    public static boolean isPalindrome(int n){
        int palindrome=n;
        int reverse=0;
        while(palindrome>0){
            int lastDigit=palindrome%10;
            reverse=reverse*10+lastDigit;
            palindrome=palindrome/10;
        }
        if(n==reverse){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        if(isPalindrome(n)){
            System.out.println("The number " + n + " is a palindrome");
        }else{
            System.out.println("The number" + n + " is not a palindrome");
        }

        //System.out.println(average(3.5, 4.5, 9));
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int a=sc.nextInt();
        System.out.println(sumOfDigits(a));*/
       
         
    }
    
}