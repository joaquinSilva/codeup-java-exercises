package shapes;

public class Square extends Quadrilateral {

    public Square() {
    }

    @Override
    public int setLength(int side) {
        return length = side;
    }

    @Override
    public int setWidth(int side) {
        return width = side;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
