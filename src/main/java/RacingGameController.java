import java.util.List;
import java.util.stream.Collectors;

public class RacingGameController {
    private RacingGame racingGame;

    public void initializeGame(String carNames, int rounds) {
        String[] names = carNames.split(",");
        racingGame = new RacingGame(names, rounds);
    }

    public void playGame() {
        for (int i = 0; i < racingGame.getRounds(); i++) {
            racingGame.playRound();
        }
    }

    public void playRound() {
        racingGame.playRound();
    }

        public List<String> getResults() {
        return racingGame.getCars().stream()
                .map(car -> car.getName() + " : " + car.getPositionAsString())
                .collect(Collectors.toList());
    }

    public List<String> getWinners() {
        int maxPosition = racingGame.getCars().stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);

        return racingGame.getCars().stream()
                .filter(car -> car.getPosition() == maxPosition)
                .map(Car::getName)
                .collect(Collectors.toList());
    }
}

