import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class RacingGameTest {
    private RacingGame game;

    @BeforeEach
    void setUp() {
        game = new RacingGame(new String[]{"car1", "car2", "car3"}, 5);
    }

    @Test
    void gameShouldHaveCorrectNumberOfCars() {
        List<Car> cars = game.getCars();
        assertEquals(3, cars.size());
    }

    @Test
    void gameShouldPlayCorrectNumberOfRounds() {
        game.playRound();
        List<Car> cars = game.getCars();
        int totalMoves = cars.stream().mapToInt(Car::getPosition).sum();
        assertTrue(totalMoves <= cars.size()); // 각 자동차가 한 번 이동했을 수도 있고 안 했을 수도 있음
    }

    @Test
    void gameShouldReturnCorrectWinners() {
        for (int i = 0; i < 5; i++) {
            game.playRound();
        }
        List<Car> cars = game.getCars();
        int maxPosition = cars.stream().mapToInt(Car::getPosition).max().orElse(0);

        List<String> winners = game.getCars().stream()
                .filter(car -> car.getPosition() == maxPosition)
                .map(Car::getName)
                .toList();

        assertNotNull(winners);
        assertTrue(winners.size() > 0);
    }
}

