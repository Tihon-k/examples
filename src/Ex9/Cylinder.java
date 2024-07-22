package Ex9;

public class Cylinder extends SolidORevolution{

    private double height = 1;

    public double getVolume(){
        setRadius(2);
        volume = height * Math.PI * Math.pow(getRadius(),2);
        return volume;
    }
}
