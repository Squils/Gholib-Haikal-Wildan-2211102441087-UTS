import greenfoot.*;

public class SnakeBody extends Actor {
    private int prevX;
    private int prevY;

    public SnakeBody() {
        GreenfootImage bodyImage = new GreenfootImage(20, 20);
        bodyImage.setColor(Color.GREEN);
        bodyImage.fill();
        setImage(bodyImage);
    }

    public void extend(int x, int y) {
        prevX = getX();
        prevY = getY();
        setLocation(x, y);
    }
}
