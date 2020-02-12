public class TorusGOL extends GOL {

//constructor//
    private TorusGOL() {
    }

    public TorusGOL(int size) {
        //save the size to size
        //initialize board and previous board
        this.size = size;
    }

    public TorusGOL(int[][] board) {
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

    @Override
    public int neighbors(int row, int col){//use modulus
        return -1;
    }//closes neighbors


}//closes class
