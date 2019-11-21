package rafi.tugas.pbo;

public class Asteroid extends Sprite {

    private final int INITIAL_X = 400;

    public Asteroid(int x, int y) {
        super(x, y);

        initAsteroid();
    }

    private void initAsteroid() {

        loadImage("C:\\Users\\Dell\\eclipse-workspace\\TugasPBO-19-11\\bin\\rafi\\tugas\\pbo\\asteroid.png");
        getImageDimensions();
    }

    public void move() {

        if (x < 0) {
            x = INITIAL_X;
        }

        x -= 1;
    }
}