package Ex10;

public class Ball extends Shape implements Square {

    private double radius;



    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public double square() {
        double ball = 4*Math.PI* Math.pow(getRadius(),2);
        return ball;
    }
}
