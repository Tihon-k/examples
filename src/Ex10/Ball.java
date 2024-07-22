package Ex10;

public class Ball extends SolidORevolution {

    public Ball(double radius){
        this.radius = radius;
    }

    @Override
    public double getVolume(){
        volume = 3/4*Math.PI* Math.pow(getRadius(),4);
        return volume;
    }
}
