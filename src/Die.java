//6510451131 Ithikorn Ungniyom

import java.util.Random;

public class Die {
    private int faceValue;
    private final Random rand;

    public Die() {
        rand = new Random();
        roll();
    }
    public void roll() {
        faceValue = rand.nextInt(6) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
