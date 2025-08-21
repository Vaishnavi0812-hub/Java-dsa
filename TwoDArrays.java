import java.util.*;
public class TwoDArrays {
    public static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }       
    }
        
    public static void main(String args[]){
        int row=2, column=3;
        int matrix[][]={{2,3,7},{5,6,7}};
        printMatrix(matrix);

        int [][]transpose=new int[column][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("The transposed matrix is");
        printMatrix(transpose);
    }
      
    
}
    /*public static void main(String args[]){
        int nums[][]={{1,4,9}, {11,4,3}, {2,2,3}};
        int sum=0;
        for(int j=0;j<nums[0].length;j++){ 
                sum+=nums[1][j];    
        }
        System.out.println("Sum is " + sum);
    }
}*/
    /*public static void main(String args[]){
        int arr[][]={{4,7,8}, {8,8,7}};
        int countOf7=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==7){
                    countOf7++;
                }
            }
        }
        System.out.println("Count of 7 is " + countOf7);
        
    }*/

    
    /*public static boolean staircaseSearch(int matrix [][], int key){
        int row=0, col=matrix[0].length-1;
    
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Key is at (" + row + "," + col + ")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }*/
    
    /*public static int diagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            //pd
            sum+=matrix[i][i];
            //sd
            if(i!=matrix.length-1-i)
                sum+=matrix[i][matrix.length-1-i];
        } 
        return sum;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
    System.out.println(diagonalSum(matrix));
    }*/
    /*public static void spiralMatrix(int matrix[][]){
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
               System.out.print(matrix[startRow][j] + " ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol] + " ");
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
        

        
    }*/
    
    /*public static boolean search(int matrix[][], int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("found at cell (" + i + " , " + j + ")" );
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;

    }
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        int n=matrix.length, m=matrix[0].length;

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 5);
    }*/
    
    


    

