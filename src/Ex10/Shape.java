package Ex10;

public abstract class Shape implements Square{

    private double cylinderSquare;
    private double ballSquare;
    private double pyramidSquare;

    //Ниже новые методы Get и Set, которые в теории должны получать информацию
    //от уже существующих значений площадей square
    //Я это сделал для того, чтоб не создавать объекты классов в абстрактном классе - родителе, а получать данные
    //он мог уже через существующие объекты, которые созданы в классе main
    //Проблема в том что он не понимает как получать значение площади и по итогу суммарная площадь равна 0

    public double getCylinderSquare() {
        return cylinderSquare;
    }

    public void setCylinderSquare(double cylinderSquare) {
        this.cylinderSquare = cylinderSquare;
    }

    public double getBallSquare() {
        return ballSquare;
    }

    public void setBallSquare(double ballSquare) {
        this.ballSquare = ballSquare;
    }

    public double getPyramidSquare() {
        return pyramidSquare;
    }

    public void setPyramidSquare(double pyramidSquare) {
        this.pyramidSquare = pyramidSquare;
    }

    @Override
    public double square() {
        double all = getCylinderSquare() + getBallSquare() + getPyramidSquare();

        return all;
    }
}
