import java.util.*;
public class bitmanipulation{
    public static void oddOrEven(int n){
        int bitMask=1;
        if((n& bitMask)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String args[]){
        //System.out.println((5&6));
        //System.out.println((5|6));
        //System.out.println(~0);
        //System.out.println((5<<2));
        //System.out.println((6>>1));
        oddOrEven(3);
        oddOrEven(6);


    }
}