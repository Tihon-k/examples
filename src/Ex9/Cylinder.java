package Ex9;

public class Cylinder extends SolidORevolution{

    private double height = 1;

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume(){

        volume = height * Math.PI * Math.pow(getRadius(),2);
        return volume;
    }
}
