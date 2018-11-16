package shapes;

public class Square extends Quadrilateral {

    public Square(int num) {
        length = num;
        width = num;
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
        return (this.length * 4);
    }

    @Override
    public double getArea() {
        return (this.length * this.length);
    }
}
