public class chessTester {

    public static void main(String[] args) {
        ChessGame game = new ChessGame(11,11);

        // game.changeBoard(6,6); 
        // game.printBoard(); 
        
    game.placeQueen(2, 2);
    //   //  game.placeRook(3,4);
    game.printBoard(); 
    //game.printPowerPiece(); 

 

    }
}