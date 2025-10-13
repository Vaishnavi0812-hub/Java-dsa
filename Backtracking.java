public class Backtracking {
    /*public static void changeArr(int arr[], int i, int val){
        if(i==arr.length){
            printArr(arr);
            return;
        }
        arr[i]=val;
        changeArr(arr, i+1, val+1);
        arr[i]=arr[i]-2;
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main (String args[]){
        int arr[]=new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
        
    }*/
    /*public static void subset(String str, String ans, int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //yes
        subset(str, ans+str.charAt(i), i+1);
        //no
        subset(str, ans, i+1);
    }

    public static void main (String args[]){
        String str="abc";
        subset(str, "", 0);
    }*/
    /*public static void findPermutations(String str, String ans){

        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newStr=str.substring(0, i) + str.substring(i+1);
            findPermutations(newStr, ans+curr);
        }
    }

    public static void main(String args[]){
        String str="abc";
        findPermutations(str,"");
    }*/
    public static boolean isSafe(char board[][], int row, int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left diagonal
        for(int i=row-1, j=col-1; i>=0 && j>=0;i--,j--){
             if(board[i][j]=='Q'){
                return false;
            }
        }
        //right diagonal
        for(int i=row-1, j=col+1; i>=0 && j<board.length;i--,j++){
             if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }
    public static boolean nQueens(char board[][], int row){
        if(row==board.length){
            count++;
            return true;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                if(nQueens(board, row+1)){
                    return true;
                }
                board[row][j]='x';
            }
        }
        return false;
    }
    public static void printBoard(char board[][]){
        System.out.println("-----chess board------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
             System.out.println();
        }
       
    }
    static int count=0;
    public static void main(String args[]){
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        if(nQueens(board,0)){
            System.out.println("Solution is possible");
            printBoard(board);
        }else{
            System.out.println("Solution is not possible");
        }
        //System.out.println("Total no of ways is " + count);
    }

    
    
}
