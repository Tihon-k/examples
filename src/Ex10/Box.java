package Ex10;

public class Box extends Shape {

    public Box(double boxSize) {
        this.volume = boxSize;
    }


    public boolean add(Shape shape) {
        this.volume = this.volume - shape.getVolume();

        if (this.volume >= 0) {
            return true;
        } else
            return false;
    }
}
