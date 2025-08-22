import java.util.*;
public class Strings{
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str="madam";
        System.out.println(isPalindrome(str));
    }

}
    /*public static void printLetters(String fullName){
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i) + " ");
        }
        System.out.println();
    }*/
    //public static void main(String args[]){
        //String str="Vaishnavi R";
        //System.out.println(str.length());
        /*String str2=new String("Vaish");

        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name);*/
        /*String firstName="Jules";
        String lastName="Ambrose";
        String fullName= firstName + " " + lastName;
        printLetters(fullName);*/
        //System.out.println("Full name is " + fullName);
        //System.out.println(fullName.charAt(4));



        
    

    

