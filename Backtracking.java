
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
    /*public static boolean isSafe(char board[][], int row, int col){
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
    }*/
    /*public static int gridWays(int i,int j,int n,int m){

        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n|| j==m){
            return 0;
        }
        int w1=gridWays(i+1, j, n, m);
        int w2=gridWays(i, j+1, n, m);
        return w1+w2;
    }

    public static void main(String args[]){
        System.out.println(gridWays(0, 0, 3, 3));
    }*/
    /*public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        //col
        for(int i=0;i<=8;i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }
        //row
        for(int j=0;j<=8;j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }
        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;

    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        //base case
        if(row==9){
            return true;
        }

        //actual recursion
        int nextRow=row,  nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(sudoku[row][col] !=0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if (isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }
    public static void printSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
                        {4,9,0,1,5,7,0,0,2},
                        {0,0,3,0,0,4,1,9,0},
                        {1,8,5,0,6,0,0,2,0},
                        {0,0,0,0,2,0,0,6,0},
                        {9,6,0,4,0,5,3,0,0},
                        {0,3,0,0,7,2,0,0,4},
                        {0,4,9,0,3,0,0,5,7},
                        {8,2,7,0,0,9,0,1,3}};
    if(sudokuSolver(sudoku,0,0)){
        System.out.println("Solutions exists");
        printSudoku(sudoku);
    }else{
        System.out.println("Solution doesnt exist");
    }
    }*/
/*public class Backtracking {
    public static boolean isSafe(int maze[][], int i, int j){
        return(i>=0 && i<maze.length && j>=0 && j<maze.length
         && maze[i][j]==1);
    }

    public static void printSolution(int sol[][]){
        for(int i=0;i<sol.length;i++){
            for(int j=0;j<sol.length;j++){
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean solveMaze(int maze[][]){
        int n=maze.length;
        int sol[][]=new int[n][n];

        if(solveMazeUtil(maze,0,0,sol)==false){
            System.out.print("Solution doesn't exist");
            return false;
        }
            printSolution(sol);
            return true;

    }

    public static boolean solveMazeUtil(int maze[][], int i, int j, int sol[][]){
        //base case
        if(i==maze.length-1 && j==maze.length-1 && maze[i][j]==1){
            sol[i][j]=1;
            return true;
        }
        if(isSafe(maze,i,j)==true){
            if(sol[i][j]==1){
                return false;
            }
            sol[i][j]=1;

            if(solveMazeUtil(maze,i+1,j,sol)){
                return true;
            }
            if(solveMazeUtil(maze,i,j+1,sol)){
                return true;
            }
            sol[i][j]=0;
            return false;

        }
        return false;
    }

    public static void main(String [] args){
        int maze[][]={{1,0,0,0},
                      {1,0,0,1},
                      {1,0,0,0},
                      {1,1,1,1}};
        solveMaze(maze);
    }

    
}*/
