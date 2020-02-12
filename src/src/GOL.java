public class GOL {
    int size;
    int[][]board;
    int[][]previous;

//will use os and 1s to determine if alive or dead//
//0=dead; 1=alive//
    //array traversal
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board[i].length;j++){
    }//closes col traversal
    }//closes row traversal

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

    public int neighbors (int row, int col){//counts LIVE neighbors//make sure to not go out of bounds
        int neighbors=0;
        for(int i=0;i<board.length;i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    neighbors++;
                }//closes if
            }//closes col
        }//closes for loop
        return neighbors;
    }//closes neighbors

    private int evolution (int n){
        //Transforms the board into the board after n steps of evolution (i.e., n successive calls to oneStep).
        oneStep(n);

    }//closes evolution
    private void printBoard(){
        board();
    }//closes printboard

    private void oneStep(){//this is where you implement the rules of the game
        [r-1][c-1]//up diag left
        [r][c-1];//left
        [r+1][c-1];//bottom diag left
        [r-1][c];//straight up
        [r+1][c];//straight down
        [r-1][c+1];//up diag right
        [r][c+1];//right
        [r+1][c+1];//bottom diag right
        int count=0;
        if (count > 3){//cell dies
        }

        if (count==3){//cell revives
        }
        if (count<2){//cell dies
        }
        if (count==2||count==3){//cell lives
        }
        if (count==1)//dies

    return;
    }//closes oneStep
    private int getDead(int[][]board){//method will count 0s as dead
        int dead=0;
        for(int i=0;i<board.length;i++) {
            for (int j = 0; j < board[i].length; j++) {
            if (board[i][j]==0){
                dead++;
            }//closes col
        }//closes row
        }//closes for loop
        return dead;
    }//closes dead method

}//closes GOL class
