import greenfoot.*;

public class Snake extends Actor
{
    private int snakeSize = 1;
    private int score = 0;
    private int step = 10;

    public void act() 
    {
        checkApple();
        checkCollision();
        move(step);
        if(Greenfoot.isKeyDown("left")) {
            setRotation(180);
        }
        if(Greenfoot.isKeyDown("right")) {
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("up")) {
            setRotation(270);
        }
        if(Greenfoot.isKeyDown("down")) {
            setRotation(90);
        }
    }    

    public void checkApple() {
        if(isTouching(Apple.class)) {
            removeTouching(Apple.class);
            snakeSize++;
            score++;
            getWorld().showText("Score: " + score, 100, 25);
            getWorld().addObject(new Apple(), Greenfoot.getRandomNumber(getWorld().getWidth()), Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
    }

    public void checkCollision() {
        if(isTouching(Obstacle.class)) {
            if (snakeSize > 1) {
                snakeSize--;
            }
        }
    }
}
