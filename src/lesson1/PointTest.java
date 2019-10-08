package lesson1;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @org.junit.jupiter.api.Test
    void getX() {
        Point point = new Point(15, 17);
        assertEquals(point.getX(), 15);
    }

    @org.junit.jupiter.api.Test
    void getY() {
        Point point = new Point(15,17);
        assertEquals(point.getY(), 17);
    }

    @org.junit.jupiter.api.Test
    void getRho() {
        Point point = new Point(15,17);
        assertEquals(point.getRho(), 22.67156809750927);
    }

    @org.junit.jupiter.api.Test
    void getTheta() {
        Point point = new Point(15,17);
        assertEquals(point.getTheta(), 0.8478169733934057
        );
    }

    @org.junit.jupiter.api.Test
    void getDistance() {
        Point point = new Point(15,17);
        Point other = new Point(13, 22);
        assertEquals(point.getDistance(other), 5.385164807134504
        );
    }

    @org.junit.jupiter.api.Test
    void getVectorTo() {
        Point point = new Point(15,17);
        Point other = new Point(13, 22);
        assertEquals(point.getVectorTo(other), new Point(-2, 5));
    }

    @org.junit.jupiter.api.Test
    void translate() {
        Point point = new Point(5, 10);
        Point other = new Point(9, 16);
        point.translate(4,6);
        assertEquals(point, other);
    }

    @org.junit.jupiter.api.Test
    void scale() {
        Point point = new Point(5, 6);
        Point other = new Point(10, 12);
        point.scale(2);
        System.out.println(point);
        assertEquals(point, other);
    }

    @org.junit.jupiter.api.Test
    void centre_rotate() {
        Point point = new Point(15, 20);
        Point other = new Point(-24.42815108472077, 5.316524671442377);
        point.centre_rotate(2.0);
        assertEquals(point, other);
    }

    @org.junit.jupiter.api.Test
    void rotate() {
        Point point = new Point(15, 20);
        Point other = new Point(0,0);
        Point result = new Point(-24.42815108472077, 5.316524671442377);
        point.rotate(other, 2.0);
        assertEquals(point, result);
    }
}