import java.util.Random;

public class Car {
    private String name;
    private int position = 0;
    private static final Random random = new Random();

    public Car(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과했습니다.");
        }
        this.name = name;
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
}

