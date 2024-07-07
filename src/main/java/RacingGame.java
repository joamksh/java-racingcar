import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private List<Car> cars = new ArrayList<>();
    private int rounds;

    public RacingGame(String[] carNames, int rounds) {
        for (String name : carNames) {
            cars.add(new Car(name.trim()));
        }
        this.rounds = rounds;
    }

    public void playRound() {
        for (Car car : cars) {
            car.move();
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public int getRounds() {
        return rounds;
    }
}

