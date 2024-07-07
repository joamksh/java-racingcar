import java.util.Random;

public class Car {
    private String name;
    private int position = 0;
    private Random random;

    public Car(String name) {
        this(name, new Random());
    }

    public Car(String name, Random random) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
        }
        this.name = name;
        this.random = random;
    }

    public void move() {
        int randomNumber = random.nextInt(10);
        if (randomNumber >= 4) {
            position++;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public String getPositionAsString() {
        return "-".repeat(position);
    }
}