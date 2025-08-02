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
import java.util.*;
public class patterns{
    public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    int income=sc.nextInt();
    int tax;
    if(income<=500000){
        tax=0;
    }
    else if(income>500000 && income<1000000){
        tax=(int)(0.2*income);
    }
    else {
        tax=(int)(0.3*income);
    }
    System.out.println("Your tax is"+ tax);

    }
}

    
