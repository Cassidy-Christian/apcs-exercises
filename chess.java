import java.util.Random; 

// ---chess game
// ---board function
// ----square function
//16 pieces for each one 
//manipulate 2d arrays
//analyze data stored in 2d array to make decisions
//deal appropriately with null values 

// ----make square white or black
// ----make randomly place the pieces on the board 
// ---make us move a piece pawns
// ----insert coordinate and see if there is a piece there
//---- 

public class chessboard{

    int[][] board= new int[8][8]; 

    //board[0][0]=1; 



public int square(int i, int j){
 
    return board[i][j]; 
}

public int changesquare(int i, int j, int value){
    board[i][j]=value; 

}

public void randomize(){
    Random ran= new Random(); 
    for(int i=0; i<board.length; i++){
        for(int j=0; j<board.length; j++){
            board[i][j]=ran.nextInt(2); 
        }
    }

}


public void setcolor(){
    for(int i=0; i<board.length; i++){
        for(int j=0; j<board.length; j++){
            if(i%2==j%2){
                board[i][j]=0;  //black
            }
            else{
                board[i][j]=1; //white
            }
}

}
}


