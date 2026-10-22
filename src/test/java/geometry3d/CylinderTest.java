package geometry3d;

import geometry2d.Circle;
import geometry2d.Rectangle;
import exceptions.InvalidFigureException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    private static final double EPSILON = 1e-9;

    @Test
    void volumeOfCylinderWithCircleBase() {
        Circle base = new Circle(2.0);
        Cylinder cylinder = new Cylinder(base, 5.0);
        // Объем = PI * r^2 * h = PI * 4 * 5 = 20 * PI
        assertEquals(20 * Math.PI, cylinder.volume(), EPSILON);
    }

    @Test
    void volumeOfCylinderWithRectangleBase() {
        Rectangle base = new Rectangle(3.0, 4.0);
        Cylinder cylinder = new Cylinder(base, 2.0);
        // Объем = 3 * 4 * 2 = 24
        assertEquals(24.0, cylinder.volume(), EPSILON);
    }

    @Test
    void cannotCreateCylinderWithNullBase() {
        assertThrows(InvalidFigureException.class, () -> new Cylinder(null, 5.0));
    }

    @Test
    void cannotCreateCylinderWithZeroHeight() {
        Rectangle base = new Rectangle(2.0, 3.0);
        assertThrows(InvalidFigureException.class, () -> new Cylinder(base, 0.0));
    }
}