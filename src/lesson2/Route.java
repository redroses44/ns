package lesson2;

import lesson1.Point;

import java.util.ArrayList;
import java.util.List;

public class Route {

    private List<Point> points;

    public Route() {
        points = new ArrayList<>();
    }

    private boolean isIndexCorrect(int index) {
        return index >= 0 && index <= points.size();
    }

    public void addPoint(double x, double y, int index) {
        if (isIndexCorrect(index)) {
            points.add(index, new Point(x, y));
        }
    }


    public void removePoint(int index) {
        if (isIndexCorrect(index)) {
            points.remove(index);
        }
    }

    public Point getPoint(int index) {
        return points.get(index);
    }

    @Override
    public String toString() {
        return "Route { " +
                "points = " + points +
                '}';
    }

    public int getLength() {
        int result = 0;
        if (points.size() <= 1) {
            return 0;
        }
        for (int i = 0; i <= points.size() - 2; i++) {
            result += points.get(i).getDistance(points.get(i + 1));
        }
        return result;
    }

    public static void main(String[] args) {
        Route route = new Route();
        route.addPoint(3.0, 4.0, 0);
        route.addPoint(4.0, 7.0, 1);
        route.addPoint(6.0, 4.0, 2);
        //route.removePoint(0);
        System.out.println(route.getLength());
        //System.out.println(route.getPoint(0));
    }
}
