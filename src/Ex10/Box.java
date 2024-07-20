package Ex10;

public class Box extends Shape {
    double box = 200;

    public double add() {
        box = box - square();
        return box;

    }

    public void foo() {
        Box box = new Box();
        double m = box.add();
        if (m >= 0) {
            System.out.println("свободно - " +m);
        } else {
            System.out.println(false);
            System.out.println("Не поместилось - " +-m);
        }
    }
}
