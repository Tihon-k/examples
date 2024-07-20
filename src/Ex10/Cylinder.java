package Ex10;

public class Cylinder extends Shape implements Square {
    private double height;
    private double radius;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        double cylinder = getHeight() * 2 * Math.PI * getRadius() + Math.PI * Math.pow(getRadius(),2);
        return cylinder;
    }
}
