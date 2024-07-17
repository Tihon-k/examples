package Ex5;

public class Vector {
    private double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        double l = Math.sqrt(x * x + y * y + z * z);
        return l;
    }

    public double scalarProduct(Vector vector) {
        double s;
        return s = x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector crossProduct(Vector vector) {
        return new Vector(
                x * vector.y - y * vector.z,
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z);

    }

    public double cos(Vector vector) {
        double cos;
        cos = vector.scalarProduct(vector) / (length() * vector.length());
        return cos;
    }

    public Vector sum(Vector vector){
       return new Vector(
                x+ vector.x,
                y+ vector.y,
                z+ vector.z);
    }
    public Vector subtract(Vector vector){
        return new Vector(
                x+ vector.x,
                y+ vector.y,
                z+ vector.z);
    }
}
