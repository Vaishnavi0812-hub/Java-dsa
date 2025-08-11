import java.util.*;
public class Arrays{
    public static void update(int marks[], int nonChangable ){
        nonChangable=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i] + 1;
        }
    }
    public static void main(String args[]){
        int marks[]={95,96,97};
        int nonChangable=5;
        update(marks, nonChangable);
        System.out.println(nonChangable);

        
        System.out.println(marks[i]);
        
        
        
    }

}


















        /*int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your physics marks :");
        marks[0]=sc.nextInt();
        System.out.println("Enter your chem marks :");
        marks[1]=sc.nextInt();
        System.out.println("Enter your math marks :");
        marks[2]=sc.nextInt();

        System.out.println("Phy marks : " + marks[0]);
        System.out.println("Chem marks : " + marks[1]);
        System.out.println("Maths marks : " + marks[2]);

        int percentage=(marks[0] + marks[1] + marks[2])/3;
        System.out.println("The percentage is " + percentage + "%");

        System.out.println("Length of the array is : " + marks.length);


        marks[2]=100; marks[2] + 1;
        System.out.println("Maths marks : " + marks[2]);*/



        



