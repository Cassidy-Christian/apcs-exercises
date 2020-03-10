import java.awt.Color;

public class Board {
    private Square[][] squares;
   
    int width, length; 

    public Board(int width, int length) {
        this.width=width; 
        this.length=length; 

    squares = new Square[width][length];
        Color color = Color.WHITE;

        // boolean isWhite=true;

        boolean isBlack = true;

        for (int row = 0; row < squares.length; row++) {
            for (int col = 0; col < squares[row].length; col++) {
                int rank = squares.length - row;
                int file = col + 1;

                if (row % 2 == col % 2) {
                    isBlack = true;
                } else {
                    isBlack = false;
                }

                if (isBlack) {
                    color = Color.BLACK;
                } else {
                    color = Color.WHITE;
                }
                squares[row][col] = new Square(rank, file, color);

            }
        }

    }

    public Square getSquare(int rank, int file) {
        if (rank < 1 || length < rank || file < 1 || width < file) {
            return null;
        }

        return squares[squares.length - rank][file - 1];
    }

    public void clearBoard() {

        // need to make loop that goes through

        for (int row = 0; row < squares.length; row++) {
            for (int col = 0; col < squares[row].length; col++) {
                if (squares[row][col].isHighlighted()) {
                    squares[row][col].toggleHighlight();
                }
            }
        }
    }

    // public Square[][] setBoard(int width, int length){
    //      squares= new Square[width][length] ; 
    //      return squares; 
    // }

    public void printPieces() {

        for (int row = 0; row < squares.length; row++) {
            for (int col = 0; col < squares[row].length; col++) {

                if (squares[row][col].getPiece() != null) {
                    System.out.print(squares[row][col].getPiece());

                    // positions with most power

                }

                else if (squares[row][col].isHighlighted()) {
                    System.out.print("+");}

                    // if(numofinf>25){
                    //     System.out.print("@"); 
                    // }
                    // if (squares[row][col].getPiece().equals("q")) {
                    //     if (row == 3 && col == 3) {
                    //         System.out.println("@");
                    //     }


                    
               
                
                else if (squares[row][col].getColor().equals(Color.WHITE)) {
                    System.out.print("-");
                } else if (squares[row][col].getColor().equals(Color.BLACK)) {
                    System.out.print("*");
                }
            }
            System.out.println();

        }

    }

   

    // public void getInfluence() {
    //     System.out.println(numofinf);
    // }

    // public void getMaxQueen(){
    //         if(numofinf>25){
    //             System.out.println("Max influence for Queen is at:"+ rank +file );
    //         }
    // }
    public int getWidth(){
        return this.width; 
    }
    public int getLength(){
        return this.length; 
    }
  
}