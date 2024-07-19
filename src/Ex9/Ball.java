package Ex9;

public class Ball extends SolidORevolution{
    public double ballSquare(){
        setRadius(1);
        double ball = 4*Math.PI* Math.pow(getRadius(),2);
        return ball;
    }
}
