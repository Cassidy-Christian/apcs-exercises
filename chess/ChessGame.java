import java.awt.Color;

public class ChessGame {
    private Board board;

    public ChessGame(int width, int length) {
        this.board = new Board(width, length);
    }

    public void placeRook(int rank, int file) {

        board.clearBoard();
        Square sq = board.getSquare(rank, file);
        sq.setPiece("r");

        for (int row = 1; row < board.getLength()+1; row++) {
            for (int col = 1; col < board.getWidth()+1; col++) {
                if (row == rank || col == file) {
                    board.getSquare(row, col).toggleHighlight();
                }

            }
        }
    }

    public void printBoard() {
        board.printPieces();
    }

    // public void changeBoard(int width, int length){
    // board.Board(width, length);
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
        for (int row = 1; row < board.getLength()+1; row++) {
            for (int col = 1; col < board.getWidth()+1; col++) {
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
        for (int row = 1; row < board.getLength()+1; row++) {
            for (int col = 1; col < board.getWidth()+1; col++) {
                if ((rank - row == col - file || rank - row == file - col) && rank != row) {
                    board.getSquare(row, col).toggleHighlight();
                } else if (row == rank || col == file) {
                    board.getSquare(row, col).toggleHighlight();
                }
            }
        }

    }

    public int checkHighlight(int rank, int file) {
        // place piece on board. then go through the loop. then reset.

        Square square = board.getSquare(rank, file);

        String ogPiece = square.getPiece();

        placeQueen(rank, file);

        int influence = 0;

        for (int row = 1; row < board.getLength()+1; row++) {
            for (int col = 1; col < board.getWidth()+1; col++) {
             
                if (board.getSquare(row, col).isHighlighted()) {
                    influence++;
                
                } 
            }
        }
        square.setPiece(ogPiece);

          
        return influence;
    }

    public Square[] maxInfluence() {
        int max = 0;
        Square[] maxxes = new Square[64];

        int numMax = 0;
        for (int row = 1; row < board.getLength()+1; row++) {
            for (int col = 1; col < board.getWidth()+1; col++) {
                if (checkHighlight(row, col) > max) {
                    max = checkHighlight(row, col);
                    numMax = 0;
                }
                if (checkHighlight(row, col) == max) {
                    maxxes[numMax] = board.getSquare(row, col);
                    numMax++;
                }

            }
        }
        Square[] finalResult = new Square[numMax];
        for (int i = 0; i < numMax; i++) {
            finalResult[i] = maxxes[i];
        }

        return finalResult;

    }

    public void printPowerPiece(){
        Square[] queensInfluence= maxInfluence(); 
       for(int i=0; i<queensInfluence.length; i++){
           queensInfluence[i].setPiece("@"); 
       }

       printBoard();  
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
