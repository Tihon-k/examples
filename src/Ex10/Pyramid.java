package Ex10;

public class Pyramid extends Shape implements Square {
    private double side;
    private double height;


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double square() {
        double pyramid = getSide() * (getSide() + 2 * getHeight());
        return pyramid;
    }
}
