package shapes;

public class Square extends Quadrilateral {

    public Square(int side) {
        super(side, side);
//        this.length = length;
//        this.width = width;
    }

    @Override
    public void setLength(int side) {
        this.length = side;
    }

    @Override
    public void setWidth(int side) {
        this.width = side;
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
