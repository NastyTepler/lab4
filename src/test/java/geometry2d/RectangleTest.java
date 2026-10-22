package geometry2d;

import exceptions.InvalidFigureException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private static final double EPSILON = 1e-9;

    @Test
    void areaOfThreeByFourRectangleIsTwelve() {
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        assertEquals(12.0, rectangle.area(), EPSILON);
    }

    @Test
    void perimeterOfThreeByFourRectangleIsFourteen() {
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        assertEquals(14.0, rectangle.perimeter(), EPSILON);
    }

    @Test
    void cannotCreateRectangleWithZeroWidth() {
        assertThrows(InvalidFigureException.class, () -> new Rectangle(0.0, 4.0));
    }

    @Test
    void cannotCreateRectangleWithNegativeHeight() {
        assertThrows(InvalidFigureException.class, () -> new Rectangle(3.0, -4.0));
    }
}