import java.awt.Graphics; 
import java.awt.Color;

public interface Paddle {
    public void draw(Graphics g);
    public void move();
    public int getY(); 
}