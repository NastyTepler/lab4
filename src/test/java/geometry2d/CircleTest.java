package geometry2d;

import exceptions.InvalidFigureException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private static final double EPSILON = 1e-9;

    @Test
    void areaOfCircleWithRadiusTwo() {
        Circle circle = new Circle(2.0);
        assertEquals(Math.PI * 4.0, circle.area(), EPSILON);
    }

    @Test
    void perimeterOfCircleWithRadiusThree() {
        Circle circle = new Circle(3.0);
        assertEquals(2 * Math.PI * 3.0, circle.perimeter(), EPSILON);
    }

    @Test
    void cannotCreateCircleWithNegativeRadius() {
        assertThrows(InvalidFigureException.class, () -> new Circle(-1.0));
    }

    @Test
    void cannotCreateCircleWithNaN() {
        assertThrows(InvalidFigureException.class, () -> new Circle(Double.NaN));
    }
}