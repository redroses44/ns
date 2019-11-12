package lesson2;

import lesson1.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class RouteTest {

    @BeforeEach
    void setUp() {
        Route route = new Route();
        Point point = new Point(5.0, 2.0);
    }

    @Test
    void addPointTest() {
        Route route = new Route();
        Point point = new Point(5.0, 5.0);
        route.addPoint(5.0, 5.0, 0);
        assertEquals(route.getPoint(0), point);
    }

    @Test
    void removePointTest() {
        Route route = new Route();
        Point point = new Point(6.0, 6.0);
        route.addPoint(5.0, 5.0, 0);
        route.addPoint(6.0, 6.0, 1);
        route.removePoint(0);
        assertEquals(route.getPoint(0), point);
    }


    @Test
    void getLengthTest() {
        Route route = new Route();
        route.addPoint(3.0, 0.0, 0);
        route.addPoint(4.0, 7.0, 1);
        route.addPoint(6.0, 4.0, 2);
        assertEquals(route.getLength(), 10);
    }


}