import greenfoot.*;

public class SnakeWorld extends World
{
    public SnakeWorld() {    
        super(600, 400, 1); 
        prepare();
    }

    private void prepare() {
        Snake snake = new Snake();
        addObject(snake, getWidth()/2, getHeight()/2);
        Apple apple = new Apple();
        addObject(apple, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        Obstacle obstacle1 = new Obstacle();
        addObject(obstacle1, 100, 200);
        Obstacle obstacle2 = new Obstacle();
        addObject(obstacle2, 200, 200);
    }
}
