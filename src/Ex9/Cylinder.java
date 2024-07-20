package Ex9;

public class Cylinder extends SolidORevolution{
    private double height = 1;
    public double cylinderSquare(){
        setRadius(2);
        double cylinder = height * 2 * Math.PI * getRadius() + Math.PI * Math.pow(getRadius(),2);
        return cylinder;
    }
}
