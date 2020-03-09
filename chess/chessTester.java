public class chessTester {

    public static void main(String[] args) {
        ChessGame game = new ChessGame();

        // game.changeBoard(6,6); 
        // game.printBoard(); 
        
    game.placeQueen(4, 5);
    //   //  game.placeRook(3,4);
    game.printBoard();
     System.out.println("Influence of piece is: "); 
    game.getPieceInfluence(); 

    }
}