import java.awt.*;

public class Square {

    private int rank, file;
    private Color color = Color.BLACK;
    private boolean isHighlighted = false;
    private String piece = null;
    private int width, length; 
    public Square(int rank, int file, Color color) {
        this.rank = rank;
        this.file = file;
        this.color = color;
         
    }

    public void toggleHighlight() {
        this.isHighlighted = !this.isHighlighted;
    }

    public boolean isHighlighted() {
        return this.isHighlighted;
    }

    public int getRank() {
        return this.rank;
    }

    public int getFile() {
        return this.file;
    }

    public Color getColor() {
        return this.color;
    }

    public String getPiece() {
        return this.piece;
    }
    public int getWidth(){
        return this.width; 
    }
    public int getLength(){
        return this.length; 
    }
    public void setWidth(int width){
        this.width=width; 
    }
    public void setLength(int length){
        this.length=length; 
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }
}