import greenfoot.*;

public class Apple extends Actor
{
    public void addedToWorld(World world) {
        setLocation(Greenfoot.getRandomNumber(world.getWidth()), Greenfoot.getRandomNumber(world.getHeight()));
    }
}
