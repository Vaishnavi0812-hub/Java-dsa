public class BacktrackingTwo {
    /*public static boolean isSafe(int maze[][], int i, int j){
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
    }*/
    

    
}
