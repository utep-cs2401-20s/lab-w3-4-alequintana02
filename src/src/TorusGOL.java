public class TorusGOL extends GOL {

//default constructor//
    private TorusGOL() {}
//////////////////////////
    public TorusGOL(int size) {
        //save the size to size
        //initialize board and previous board
        this.size = size;
    }
////////////////////////////////////////////////
    public TorusGOL(int[][] board) {
        //save a's size to size: board.length;
        //initialize previous to size
        //nested for loop; copy board to previous
        //initialize your board to size
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                this.board = board;
            }//closes col
        }//closes row
    }//closes class

    //////////////
    //getters///
    public int[][] getBoard() {
        return board;
    }//closes getBoard
    /////////////




    @Override
    public int neighbors(int row, int col){//use modulus
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


}//closes class
