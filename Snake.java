import greenfoot.*;

public class Snake extends Actor {
    private int snakeSize = 3;
    private int score = 0;
    private int step = 20;

    public Snake() {
        // Constructor kosong atau bisa diisi dengan logika inisialisasi yang tidak memerlukan akses ke World
    }

    public void addedToWorld(World world) {
        int initialX = 60; // Sesuaikan dengan posisi awal X
        int initialY = world.getHeight() / 2; // Atur agar di tengah tinggi dunia
        for (int i = 0; i < snakeSize; i++) {
            world.addObject(new SnakeBody(), initialX + i * step, initialY);
        }
    }

    public void act() {
        checkApple();
        checkCollision();
        move(step);
        if (Greenfoot.isKeyDown("left")) {
            setRotation(180);
        }
        if (Greenfoot.isKeyDown("right")) {
            setRotation(0);
        }
        if (Greenfoot.isKeyDown("up")) {
            setRotation(270);
        }
        if (Greenfoot.isKeyDown("down")) {
            setRotation(90);
        }
    }

    public void checkApple() {
        if (isTouching(Apple.class)) {
            removeTouching(Apple.class);
            snakeSize++;
            score++;
            getWorld().showText("Score: " + score, 100, 25);
            getWorld().addObject(new Apple(), Greenfoot.getRandomNumber(getWorld().getWidth()), Greenfoot.getRandomNumber(getWorld().getHeight()));
            extend();
        }
    }

    public void checkCollision() {
        if (isTouching(Obstacle.class)) {
            if (snakeSize > 3) {
                snakeSize--;
            }
        }
    }

    public void extend() {
        SnakeBody newBody = new SnakeBody();
        getWorld().addObject(newBody, getX(), getY());
    }
}
