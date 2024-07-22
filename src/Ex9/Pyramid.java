package Ex9;

public class Pyramid extends Shape{
    private double side = 5;
    private double height = 6;

    public Pyramid(double side, double height){
        this.side = side;
        this.height = height;
    }

    @Override
    public double getVolume(){
        //Трехгранная пирамида*
        volume = height * Math.pow(side,2) * Math.sqrt(3) / 4;
        return volume;
    }
}
