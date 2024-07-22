package Ex10;

public class Ball extends SolidORevolution implements GetVolume {
    //packagePrivate
    public double getVolume(){
        setRadius(1);
        volume = 3/4*Math.PI* Math.pow(getRadius(),4);
        return volume;
    }
}
