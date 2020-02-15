public class GOL {
    int size;
    int[][]board;
    int[][]previous;
    int[][] board1 = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}};
    int[][] board2 = {
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 1, 0},
            {0, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}};
    int[][] board3 = {
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 1, 1, 0},
            {0, 0, 0, 1, 1, 0},
            {0, 0, 0, 0, 0, 0}};
    int[][] board4 = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

//will use os and 1s to determine if alive or dead//
//0=dead; 1=alive//
    //array traversal
    //for(int i=0;i<board.length;i++){
   //     for(int j=0;j<board[i].length;j++){
   // }//closes col traversal
   // }//closes row traversal

    //constructors//
    public GOL() {} //default constructor

    public GOL(int size) {
        //save the size to size
        //initialize board and previous board
        this.size = size;
    }

    public GOL(int[][] board) {
        //save a's size to size: board.length;
       //initialize previous to size
        //nested for loop; copy board to previous
        //initialize your board to size
        this.board=board;
    }
    //////////////
    //getters///
    public int[][] getBoard() {
        return board;
    }//closes getBoard
    /////////////
                                        ////////////////////////////////////////////
                                                        ////neighbors////
                                        ////////////////////////////////////////////
    public int neighbors (int row, int col){//counts LIVE neighbors//make sure to not go out of bounds
        int neighbors=0;
            for(int r=0;r<board.length;r++) {
                for (int c = 0; c < board[r].length; c++) {
                      if (board[r - 1][c - 1] == 1) {// up diag left
                        neighbors++;
                    } if (board[r][c - 1] == 1) {//left
                        neighbors++;
                    } if (board[r + 1][c - 1] == 1) {//bottom diag left
                        neighbors++;
                    } if (board[r - 1][c] == 1) {//straight up
                        neighbors++;
                    } if (board[r + 1][c] == 1) {//straight down
                        neighbors++;
                    } if (board[r - 1][c + 1] == 1) {//up diag right
                        neighbors++;
                    } if (board[r][c + 1] == 1) {//right
                        neighbors++;
                    } if (board[r + 1][c + 1] == 1) {//bottom diag right
                            neighbors++;
                    }
            }//closes col
        }//closes for loop
        return neighbors;
    }//closes neighbors
                                        ////////////////////////////////////////////
                                                        ////evolution////
                                        ////////////////////////////////////////////
    private int evolution (int n){
        //Transforms the board into the board after n steps of evolution (i.e., n successive calls to oneStep).
        return evolution(oneStep(n));
    }//closes evolution

    private void printBoard(int[][]board){
        for(int i=0;i<board.length;i++){
            for (int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]);
            }//closes col
        }//closes row
    }//closes printBoard
                                        ////////////////////////////////////////////
                                                        ////one step////
                                        ////////////////////////////////////////////
    private void oneStep(){//this is where you implement the rules of the game
        int neighbors=0;
        int dead=0;
        //to copy board to previous
        for(int r=0;r<previous.length;r++) {
            for (int c = 0; c < previous[r].length; c++) {
                board[r][c] = previous[r][c];
            }//closes col
        }//closes row
        //to copy previous to board
        for(int r=0;r<board.length;r++) {
            for (int c = 0; c < board[r].length; c++) {
                previous[r][c] = board[r][c];
            }//closes col
        }//closes row

      //  if (count > 3){//cell dies
     //   }
     //   if (count==3){//cell revives
      //  }
   //     if (count<2){//cell dies
     //   }
   //     if (count==2||count==3){//cell lives
       // }
    //    if (count==1)//dies
         //   }//closes col
        //}//closes row
        //
    return;
    }//closes oneStep

                                                ////////////////////////////////////////////
                                                            ////dead////
                                                ////////////////////////////////////////////
    private int getDead(int[][]board){//method will count 0s as dead
        int dead=0;
        for(int r=0;r<board.length;r++) {
            for (int c = 0; c < board[r].length; c++) {
                  if (board[r - 1][c - 1] == 0) {
                    dead++;
                } if (board[r][c - 1] == 0) {
                    dead++;
                } if (board[r + 1][c - 1] == 0) {
                    dead++;
                } if (board[r - 1][c] == 0) {
                    dead++;
                } if (board[r + 1][c] == 0) {
                    dead++;
                } if (board[r - 1][c + 1] == 0) {
                    dead++;
                } if (board[r][c + 1] == 0) {
                    dead++;
                } if (board[r + 1][c + 1] == 0) {
                    dead++;
            }//closes col
        }//closes row
        }//closes for loop
        return dead;
    }//closes dead method

}//closes GOL class
