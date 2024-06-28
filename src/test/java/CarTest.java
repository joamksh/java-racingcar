import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

class CarTest {
    private Car car;
    private Random fixedRandom;

    @BeforeEach
    void setUp() {
        fixedRandom = new Random() {
            @Override
            public int nextInt(int bound) {
                return 3; // 항상 3을 반환하여 move()가 호출되도 이동하지 않도록 함
            }
        };
        car = new Car("test", fixedRandom);
    }

    @Test
    void carShouldNotMoveWhenRandomNumberIsLessThan4() {
        for (int i = 0; i < 1000; i++) {
            car.move();
        }
        assertEquals(0, car.getPosition());
    }

    @Test
    void carShouldHaveCorrectName() {
        assertEquals("test", car.getName());
    }

    @Test
    void carNameShouldBeLessThanOrEqualTo5Characters() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Car("toolongname", fixedRandom);
        });
    }
}