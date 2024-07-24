package Ex9;

public class Ball extends SolidORevolution{

    public Ball(double radius){
        this.radius = radius;
    }

    @Override
    public double getVolume(){
        return 3.0/4.0*Math.PI* Math.pow(getRadius(),4);
    }
}
