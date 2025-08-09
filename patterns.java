//public class patterns {
    //public static void main (String args[]){
        /*for (int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*for (int i=1; i<=4; i++){
            for(int j=4; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*int n=4;
        for (int i=1;i<=4;i++){
            for(int j=1; j<=n-i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*for(int i=1; i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

        /*char ch='A';
        for(int i=1; i<=4;i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }*/
        
        /*for(int i=1;i<=5;i++){
            for(int j=1; j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*for(int i=1;i<=3;i++){
            for(int j=1; j<=10;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*for(int i=1;i<=5;i++){
            for(int j=1; j<=5;j++){
                if(i-j<=0){
                    System.out.print("*");
                }
            }
            System.out.println();
        }*/

        /*for(int i=1;i<=5;i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        
          /*for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i+j>=5+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
          }*/
          /*int n=6;
          int m=15;
          for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
          }*/

          /*int n=7;
          for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i-j<=0){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
          }*/

          /*int n=5;
          for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j || i+j==n+1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
          }*/
          
          /*for(int i=1;i<=5;i++){
            int val=i;
            for(int j=1;j<=5;j++){
                if(i-j>=0){
                    System.out.print(val);
                    
                }
            }
            System.out.println();
          }*/

          /*for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i-j>=0){
                    System.out.print(j);
                }
                
            }
            System.out.println();
          }*/
          
          /*for(int i=1;i<=5;i++){
            int val=i;
            for(int j=1;j<=5;j++){
                if(i-j>=0){
                    System.err.print(val);
                }
            }
            System.out.println();
          }*/

          /*int num=1;
          for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i-j>=0){
                    System.err.print(num);
                    num++;
                }
            }
            System.out.println();
          }*/
          
/*public class patterns{
    public static void printhello() {
          System.out.println("Hello");
          System.out.println("Hello");
          System.out.println("Hello");
          return;
    }

    public static void main(String args[]){
        printhello();
    }
}*/
/*import java.util.*;
public class patterns{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);

    }
}*/

/*import java.util.*;
public class patterns{
    public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    /*int number=sc.nextInt();
    int i=1;
    int sum=0;
    while(i<=number){
        sum=sum+i;
        i++;
        
    }
    System.out.println(sum);*/

    /*int num=sc.nextInt();
    while(num>0){
        int lastdigit=num%10;
        System.out.print(lastdigit);
        num = num/10;
    }
    System.out.println();*/

    /*int i=0;
    do{
        System.out.println("Tanya");
        i++;
    }while(i<=5);*/

    /*do{
        System.out.println("Enter your num : ");
        int num=sc.nextInt();
        if(num%10==0){
            continue;
        }
        System.out.println(num);
    } while(true);*/

    /*System.out.println("Enter your number :");
    int num=sc.nextInt();
    if(num==2){
        System.out.println(num + "is prime");
    }
    boolean isPrime=true;
    for(int i=2;i<=Math.sqrt(num);i++){
        if(num%i==0){
            isPrime=false;
        }
    }
    if(isPrime==true){
        System.out.println(num + " is prime");
    }
    else{
        System.out.println(num + " is not prime");
    }*/

    /*int number;
    int choice;
    int evensum=0;
    int oddsum=0;
    do{
        System.out.println("Enter a number:");
        number=sc.nextInt();
        if(number%2==0){
            evensum+=number;
        }
        else{
            oddsum+=number;
        }
        System.out.println("If u wish to continue press  1 else 0");
        choice=sc.nextInt();
      }while(choice==1);

      System.out.println("Sum of even numbers is " + evensum);
      System.out.println("Sum of odd numbers is " + oddsum);*/

      /*System.out.println("Enter a number : ");
      int num=sc.nextInt();
      for(int i=1;i<=10;i++){
        System.out.println(num + "*" + i + "=" + num*i);
      }*/

      /*int fact=1;
      System.out.println("Enter a number");
      int num=sc.nextInt();
      for(int i=1;i<=num;i++){
        fact*=i;
      }
      System.out.println("Factorial is " + fact);*/


      /*import java.util.*;

      public class patterns {
        /*public static void printhello(){
            System.out.println("Hello");
            System.out.println("Hello");
            return;
        }*/

        /*public static int calculatesum(int a,int b){
            
            int sum=a+b;
            return sum;
        }*/

        /*public static void 
        public static void main (String  args[]){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum=calculatesum(a,b);
            System.out.println("The sum is " + sum);
        }*/

        /*public static int multiply(int a,int b){
            int product=a*b;
            return product;
        }/* */

        /*public static int factorial(int n){
            int fact=1;
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
            return fact;
        }*/


        /*public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int a=10;
            int b=5;
            int product=multiply(a,b);
            System.out.println("Product is " + product);
            int prod=multiply(25,25);
            System.out.println("a*b= " + prod);
        }*/
        
        /*public static int binCoeff(int n,int r){
            int fact_n=factorial(n);
            int fact_r=factorial(r);
            int fact_nmr=factorial(n-r);

            int binCoeff=fact_n/(fact_r*fact_nmr);
            return binCoeff;
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println(binCoeff(5,2));
        }*/

        /*public static int sum(int a,int b){
            return a+b;
        }
        public static int sum(int a, int b, int c){
            return a+b+c;
        }
        public static float sum(float a,float b){
            return a+b;
        }

        public static void main(String args[]){
            System.out.println(sum(2,3));
            System.out.println(sum(3,4,5));
            System.out.println(sum(3.2f,7.8f));
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
        }
        public static void main(String args[]){
            primeRange(20);
        }*/

        /*public static void binToDec(int binNum){
            int myNum=binNum;
            int decNum=0;
            int pow=0;
            while(binNum>0){
                int LastDigit=binNum%10;
                decNum= decNum + (LastDigit * (int)Math.pow(2,pow));
                pow++;

                binNum=binNum/10;
            }
            System.out.println("The decimal of " + myNum + " is " + decNum);
        } 
        public static void main(String args[]){
            binToDec(1000);
        }*/

        /*public static void decToBin(int n){
            int myNum=n;
            int binNum=0;
            int pow=0;

            while(n>0){
                int rem = n%2;
                binNum = binNum + (rem* (int)Math.pow(10,pow));
                pow++;

                n=n/2;
            }
            System.out.println("The binary number of " + myNum + " is " + binNum);
        }

        public static void main(String args[]){
            decToBin(8);
        }*/

        /*public static double average(double a,double b,double c){
            double average=(a+b+c)/3;
            return average;
        }
        public static void main(String args[]){
            System.out.println(average(3.2,4.2,5.2));
        }*/

        
           /*public static double average(double a, double b, double c){
            return (a+b+c)/3;
           }
            
           public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your first number : ");
            double a=sc.nextDouble();
            System.out.println("Enter your second number : ");
            double b=sc.nextDouble();
            System.out.println("Enter your third number : ");
            double c=sc.nextDouble();
            System.out.println("The average of 3 numbers is " + average(a,b,c));
           }*/

           /*public static boolean isEven(int n){
            if(n%2==0){
                return true;
            }
            else {
                return false;
            }
           }
           public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your number");
            int n=sc.nextInt();
            if(isEven(n)){
                System.out.println("Even number");
            }
            else{
                System.out.println("Odd number");
            }

           }*/

           /*public static boolean isPalindrome(int n){
            int palindrome=n; //copied number to variable
            int reverse=0;

            while(palindrome>0){
                int remainder=palindrome%10;
                reverse=reverse *10+ remainder;
                palindrome=palindrome/10;
            }
            if(n==reverse){
                return true;
            }
            else {
                return false;
            }
        
           }
           public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your number");
            int palindrome=sc.nextInt();

            if(isPalindrome(palindrome)){
                System.out.println("Number " + palindrome + " is  a palindrome");
            }
            else{
                System.out.println("Number " + palindrome + " is not a palindrome");
            }
            
           }

           /*public static int sumOfInteger(int n){
            int sum=0;
            while(n>0){
                int lastDigit=n%10;
                sum=sum+lastDigit;
                n=n/10;
            }
            return sum;

           }
           public static void main(String args[]){
            System.out.println("Enter a number : ");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println("The sum of given integer is " + sumOfInteger(n));


           }*/
           public class patterns{
            public static void hollowRectangle(int totalRows, int totalCols){
                //outer loop
                for(int i=1;i<=totalRows;i++){
                    for(int j=1;j<=totalCols;j++){
                        if(i==1||i==totalRows||j==1||j==totalCols){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
            public static void main(String args[]){
                hollowRectangle(4,5);


                /*for(int i=1;i<=4;i++){
                    for(int j=1;j<=i;j++){
                            System.out.print(j);     
                    }
                    System.out.println();
                }*/

                /*for(int i=1;i<=5;i++){
                    for(int j=5;j>=i;j--){                             
                        System.out.print(j);
                    }
                    System.err.println();
                }*/

                
            }
        }
            
           

           
           
          

        



            
        

      

    

      