package Ex9;

public class Box extends Shape {


    public Box(double boxSize) {
        this.volume = boxSize;
    }



    public boolean add(Shape shape) {
        this.volume  = this.volume - shape.getVolume();
        return this.volume>0;
    }
}
