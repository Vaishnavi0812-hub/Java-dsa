import java.util.*;
public class Strings{
    public static String substring(String str,int si,int ei){
        String substr=" ";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    /*public static float getShortestPath(String path){
        int x=0, y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);

            //South
            if(dir=='S'){
                y--;
            }
             //North
            if(dir=='N'){
                y++;
            }
             //West
            if(dir=='W'){
                x--;
            }
             //East
            if(dir=='E'){
                x++;
            }

        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);


    }*/
    public static void main(String args[]){
        //String path="WNEENESENNN";
        //System.out.println(getShortestPath(path));
        String str="Vaishnavi";
        System.out.println(substring(str, 0, 4));
        //System.out.println(str.substring(0,5));
    }
}
    /*public static boolean isPalindrome(String str){
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
    }*/


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



        
    

    

