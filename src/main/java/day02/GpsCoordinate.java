package day02;

public class GpsCoordinate {
    private final double x;
    private final double y;
    private final double elevation;

    public GpsCoordinate(double x, double y, double elevation) {
        this.x = x;
        this.y = y;
        this.elevation = elevation;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getElevation() {
        return elevation;
    }
}