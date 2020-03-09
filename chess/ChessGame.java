import java.awt.Color;

public class ChessGame {
    private Board board;

    public ChessGame() {
        this.board = new Board( );
    }

    public void placeRook(int rank, int file) {

        board.clearBoard();
        Square sq = board.getSquare(rank, file);
        sq.setPiece("r");

        for (int row = 1; row < 9; row++) {
            for (int col = 1; col < 9; col++) {
                if (row == rank || col == file) {
                    board.getSquare(row, col).toggleHighlight();
                }

            }
        }
    }

    public void printBoard() {
        board.printPieces();
    }

    public void getPieceInfluence(){
        board.getInfluence(); 
    }
    // public void changeBoard(int width, int length){
    //     board.Board(width, length); 
    // }

    public void placeKnight(int rank, int file) {
        board.clearBoard();
        Square sq = board.getSquare(rank, file);
        sq.setPiece("k");
        if (board.getSquare(rank - 2, file - 1) != null) {
            board.getSquare(rank - 2, file - 1).toggleHighlight();
        }
        if (board.getSquare(rank - 1, file - 2) != null) {
            board.getSquare(rank - 1, file - 2).toggleHighlight();
        }
        if (board.getSquare(rank - 2, file + 1) != null) {
            board.getSquare(rank - 2, file + 1).toggleHighlight();
        }
        if (board.getSquare(rank - 1, file + 2) != null) {
            board.getSquare(rank - 1, file + 2).toggleHighlight();
        }
        if (board.getSquare(rank + 2, file + 1) != null) {
            board.getSquare(rank + 2, file + 1).toggleHighlight();
        }
        if (board.getSquare(rank + 1, file + 2) != null) {
            board.getSquare(rank + 1, file + 2).toggleHighlight();
        }
        if (board.getSquare(rank + 2, file - 1) != null) {
            board.getSquare(rank + 2, file - 1).toggleHighlight();
        }
        if (board.getSquare(rank + 1, file - 2) != null) {
            board.getSquare(rank + 1, file - 2).toggleHighlight();
        }

    }

    public void placeBishop(int rank, int file) {
        board.clearBoard();
        Square sq = board.getSquare(rank, file);
        sq.setPiece("b");
        for (int row = 1; row < 9; row++) {
            for (int col = 1; col < 9; col++) {
                if ((rank - row == col - file || rank - row == file - col) && rank != row) {
                    board.getSquare(row, col).toggleHighlight();
                }
            }
        }
    }

    public void placeQueen(int rank, int file) {
        board.clearBoard();
        Square sq = board.getSquare(rank, file);
        sq.setPiece("q");
        for (int row = 1; row < 9; row++) {
            for (int col = 1; col < 9; col++) {
                if ((rank - row == col - file || rank - row == file - col) && rank != row) {
                    board.getSquare(row, col).toggleHighlight();
                } else if (row == rank || col == file) {
                    board.getSquare(row, col).toggleHighlight();
                }
            }
        }

    }

    // public void placeBishop(int rank, int file){
    // board.clearBoard();
    // Square sq= board.getSquare(rank, file);
    // sq.setPiece("b");

    // }

}

// public void placeRook2(int rank, int file){
// board.clearBoard();
// Square sq= board.getSquare(rank, file);
// sq.setPiece("r");
// for(int i=1; i<9; i++){
// board.getSquare(rank, i).toggleHighlight();
// board.getSquare(i, file).toggleHighlight();
// }
// }
