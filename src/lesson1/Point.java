package lesson1;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRho() {
        return Math.sqrt(getX() * getX() + getY() * getY());
    }

    public double getTheta() {
        return Math.atan2(getY(), getX());
    }

    @Override
    public String toString() {
        return "Point [ x = " + getX() + ", y = " + getY() + ", rho = " + getRho()
                + ", theta = " + getTheta() + "]";
    }

    public double getDistance(Point other) {
        return getVectorTo(other).getRho();
    }

    public Point getVectorTo(Point other) {
        return new Point(other.getX() - this.getX(), other.getY() - this.getY());
    }

    public void translate(double x, double y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }


    public void scale(int factor) {
        this.x *= factor;
        this.y *= factor;
    }

    public void centre_rotate(double angle) {
        double temp_x = this.getRho() * Math.cos(this.getTheta() + angle);
        double temp_y = this.getRho() * Math.sin(this.getTheta() + angle);
        this.x = temp_x;
        this.y = temp_y;
    }

    public Point rotate(Point p, double angle) {
        this.translate(-p.getX(), -p.getY());
        this.centre_rotate(angle);
        this.translate(p.getX(), p.getY());
        //return new Point(p.getX(), p.getY());
        //return new Point(p.getX(), p.getY());
        return new Point(this.getX(), this.getY());
    }

    public static void main(String[] args) {
        Point point = new Point(42, 11);
        Point point2 = new Point(15, 20);
        Point point3 = new Point(13, 22);
        Point point4 = new Point(15, 17);
        Point point5 = new Point(0, 0);
        //System.out.println(point2.getDistance(point3));
        //System.out.println(point4.rotate(point5, Math.PI / 3));
        System.out.println(point2);
        point2.rotate(point5, 2.0);
        System.out.println(point2);
    }





}