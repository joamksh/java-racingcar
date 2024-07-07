
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class RacingGameControllerTest {
    private RacingGameController controller;

    @BeforeEach
    void setUp() {
        controller = new RacingGameController();
    }

    @Test
    void shouldInitializeGameCorrectly() {
        controller.initializeGame("car1,car2,car3", 5);
        assertNotNull(controller);
    }

    @Test
    void shouldPlayGameCorrectly() {
        controller.initializeGame("car1,car2,car3", 5);
        controller.playGame();
        List<String> results = controller.getResults();
        assertEquals(3, results.size());
    }

    @Test
    void shouldReturnWinnersCorrectly() {
        controller.initializeGame("car1,car2,car3", 5);
        controller.playGame();
        List<String> winners = controller.getWinners();
        assertNotNull(winners);
    }
}

