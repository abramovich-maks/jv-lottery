package core.basesyntax;

import java.util.Random;

class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor, new Random().nextInt(100) + 1);
    }
}
