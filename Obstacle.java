import greenfoot.*;

public class Obstacle extends Actor {
    public Obstacle() {
        // Ganti "path_to_image" dengan path sebenarnya dari gambar Anda
        GreenfootImage obstacleImage = new GreenfootImage("obstacle.png");
        setImage(obstacleImage);
    }

    public void addedToWorld(World world) {
        int randomX = Greenfoot.getRandomNumber(world.getWidth());
        int randomY = Greenfoot.getRandomNumber(world.getHeight());
        setLocation(randomX, randomY);
    }
}