package Ex10;

public class Pyramid extends Shape implements GetVolume {
    private double side = 5;
    private double height = 6;


    public double getVolume(){
        //Трехгранная пирамида*
        volume = height * Math.pow(side,2) * Math.sqrt(3) / 4;
        return volume;
    }
}
