package Ex9;

public class SolidORevolution extends Shape {
    private double radius;

    protected double getRadius() {
        return radius;
    }

    //Добавил set, иначе тут наличие метода get не несет никакой ценности (нельзя сделать разные радиусы у ball и cylinder)
    protected void setRadius(double radius) {
        this.radius = radius;
    }
}
