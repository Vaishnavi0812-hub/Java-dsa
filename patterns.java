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


      import java.util.*;

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
        }

        public static int factorial(int n){
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
        
        public static int bincoeff(int n,int r){
            n fact=fact
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println(factorial(4));
        }
            
        }

      

    

      